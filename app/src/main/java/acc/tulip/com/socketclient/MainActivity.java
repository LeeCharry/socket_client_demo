package acc.tulip.com.socketclient;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.List;

import acc.tulip.com.socketclient.xmlparse.XmlToJson;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "lcy";
    private TextView tvShow;
    private ServerSocket serverSocket = null;
    private Gson gson;
    private List<ScreenDataBean.RootBean.ScreenBean.DisplaysBean.DisplayBean> displayBeanList;
    private LinearLayout llRoot;
    private Button tvXmlparse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gson = new Gson();
        tvShow = findViewById(R.id.tv_show);
        llRoot = findViewById(R.id.ll_root);
        tvXmlparse = findViewById(R.id.tv_xmlparse);

        //1、客户端测试接收字符串数据
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                monitorSocket();
//            }
//        }).start();

        //2、客户端测试接收文件数据，保存本地，并解析
        Thread acceptThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int port = 10001;

                try {
                    serverSocket = new ServerSocket(port);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (null != serverSocket) {
                    while (true) {
                        String result = receiveFile();
                        Log.d(TAG, result);
                    }
                }
            }
        });
        acceptThread.start();

        //3、解析xml
        tvXmlparse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String json = xmlParse();
                if (null != json) {
                    ScreenDataBean screenDataBean = gson.fromJson(json, ScreenDataBean.class);
                    displayBeanList = screenDataBean.getRoot().getScreen().getDisplays().getDisplay();
                    updateText(displayBeanList);
                }
            }
        });
    }

    private void updateText(List<ScreenDataBean.RootBean.ScreenBean.DisplaysBean.DisplayBean> displayBeanList) {
        for (int i = 0; i < displayBeanList.size(); i++) {
            ScreenDataBean.RootBean.ScreenBean.DisplaysBean.DisplayBean displayBean = displayBeanList.get(i);
            TextView tv = new TextView(this);
            tv.setWidth(Integer.parseInt(displayBean.getEWidth()));
            tv.setHeight(Integer.parseInt(displayBean.getEHeight()));
            tv.setPadding(9, 9, 9, 9);

//            tv.setText(displayBean.getElements().getT().getText() == null ? "":displayBean.getElements().getXh().getText().toString());

            tv.setTextColor(Color.parseColor(displayBean.getTextColor()));
            tv.setTextSize(Float.parseFloat(displayBean.getTextSize()));

            if (displayBean.getAligntype().equals("CENTER_HORIZONTAL")) {
                tv.setGravity(Gravity.CENTER_HORIZONTAL);
            } else if (displayBean.getAligntype().equals("CENTER")) {
                tv.setGravity(Gravity.CENTER);
            } else if (displayBean.getAligntype().equals("CENTER_VERTICAL")) {
                tv.setGravity(Gravity.CENTER_VERTICAL);
            }else{
                tv.setGravity(Gravity.CENTER_HORIZONTAL);
            }

            tv.setTop(Integer.parseInt(displayBean.getTop()));
            tv.setLeft(Integer.parseInt(displayBean.getLeft()));


            llRoot.addView(tv);
        }
        tvXmlparse.setVisibility(View.INVISIBLE);
        tvShow.setVisibility(View.INVISIBLE);
    }

    /**
     * 接收服务端文件数据
     *
     * @return
     */
    private String receiveFile() {
        try {
            // 接收文件名
            Socket name = serverSocket.accept();
            InputStream nameStream = name.getInputStream();
            InputStreamReader streamReader = new InputStreamReader(nameStream);
            BufferedReader br = new BufferedReader(streamReader);
            String fileName = br.readLine();
            br.close();
            streamReader.close();
            nameStream.close();
            name.close();

            // 接收文件数据
            Socket data = serverSocket.accept();
            InputStream dataStream = data.getInputStream();
            File dir = new File("/sdcard/MyReceivedXml"); // 创建文件的存储路径
            if (!dir.exists()) {
                dir.mkdirs();
            }
            String savePath = "/sdcard/MyReceivedXml/" + fileName; // 定义完整的存储路径
            FileOutputStream file = new FileOutputStream(savePath, false);
            byte[] buffer = new byte[1024];
            int size = -1;
            while ((size = dataStream.read(buffer)) != -1) {
                file.write(buffer, 0, size);
            }
            file.close();
            dataStream.close();
            data.close();
            return fileName + " 接收完成";
        } catch (Exception e) {
            return "接收错误:\n" + e.getMessage();
        }
    }

    private String xmlParse() {
        AssetManager assetManager = this.getAssets();
//        InputStream inputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("/sdcard/MyReceivedXml/dpjh.xml");
//            inputStream = assetManager.open("myFile.xml");
            XmlToJson xmlToJson = new XmlToJson.Builder(fileInputStream, null).build();
            fileInputStream.close();

//            String xmlString = null;  // some XML String previously created
//            XmlToJson xmlToJson = new XmlToJson.Builder(xmlString).build();
            // convert to a JSONObject
            JSONObject jsonObject = xmlToJson.toJson();

            // convert to a Json String
            String jsonString = xmlToJson.toString();

            // convert to a formatted Json String
            String formatted = xmlToJson.toFormattedString();

            Log.d("lcy", "解析后的json:\n" + jsonString);
            Log.d("lcy", "解析后的formatted:\n" + formatted);

            return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    private void monitorSocket() {
        try {
            Socket socket = new Socket(getIPAddress(this), 10001);
            //设置10秒之后即认为是超时
            socket.setSoTimeout(10000);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            final String line = br.readLine();

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    tvShow.setText("来自服务器的数据：" + line);
                }
            });
            br.close();
            socket.close();

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            Log.e("UnknownHost", "来自服务器的数据  " + e.getMessage().toString());
            e.printStackTrace();
        } catch (IOException e) {
            Log.e("IOException", "来自服务器的数据  " + e.getMessage().toString());
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String getIPAddress(Context context) {
        NetworkInfo info = ((ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        if (info != null && info.isConnected()) {
            if (info.getType() == ConnectivityManager.TYPE_MOBILE) {//当前使用2G/3G/4G网络
                try {
                    //Enumeration<NetworkInterface> en=NetworkInterface.getNetworkInterfaces();
                    for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                        NetworkInterface intf = en.nextElement();
                        for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements(); ) {
                            InetAddress inetAddress = enumIpAddr.nextElement();
                            if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                                Log.d(TAG, "当前使用2G/3G/4G网络 ip地址：" + inetAddress.getHostAddress());
                                return inetAddress.getHostAddress();
                            }
                        }
                    }
                } catch (SocketException e) {
                    e.printStackTrace();
                }

            } else if (info.getType() == ConnectivityManager.TYPE_WIFI) {//当前使用无线网络
                WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                String ipAddress = intIP2StringIP(wifiInfo.getIpAddress());//得到IPV4地址
                Log.d(TAG, "当前使用无线网络 ip地址：" + ipAddress);
                return ipAddress;
            }
        } else {
            //当前无网络连接,请在设置中打开网络
        }
        return null;
    }

    /**
     * 将得到的int类型的IP转换为String类型
     *
     * @param ip
     * @return
     */
    public static String intIP2StringIP(int ip) {
        return (ip & 0xFF) + "." +
                ((ip >> 8) & 0xFF) + "." +
                ((ip >> 16) & 0xFF) + "." +
                (ip >> 24 & 0xFF);
    }

}
