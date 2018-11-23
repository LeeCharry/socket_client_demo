package acc.tulip.com.socketclient;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SpeechUtility;


/**
 *
 */
public class VoicePlayActivity extends AppCompatActivity{
    private static final int REQ_TTS_STATUS_CHECK = 100;
    private EditText tvContent;
    private Button btnVoicePlay;
    private TextToSpeech tts;
    //    private TextToSpeechBeta mTTS;
    private String TAG = "lcy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice_play);

        tvContent = (EditText) findViewById(R.id.tv_content);
        btnVoicePlay = (Button) findViewById(R.id.btn_voice_play);

        SpeechUtility.createUtility(this, SpeechConstant.APPID + "=5bf774e4");

        //语音合成(SpeechSynthesizer)：将一段文字读出来
        btnVoicePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1.创建SpeechSynthesizer对象, 第二个参数：本地合成时传InitListener
                SpeechSynthesizer mTts = SpeechSynthesizer
                        .createSynthesizer(VoicePlayActivity.this, null);
                // 2.合成参数设置，详见《科大讯飞MSC API手册(Android)》SpeechSynthesizer 类
                // 设置发音人（更多在线发音人，用户可参见 附录12.2
//				语言（LANGUAGE，中文、英文等）
//				方言（ACCENT，中文的普通话，粤语等）
//				发音人特征（性别，年龄，语气）
//				语速（SPEED）
//				音量（VOLUME）
//				语调（PITCH）
//				音频采样率（SAMPLE_RATE）
                mTts.setParameter(SpeechConstant.VOICE_NAME, "xiaoyan"); // 设置发音人，可以根据这个设置发言的方言
                mTts.setParameter(SpeechConstant.SPEED, "50");// 设置语速
                mTts.setParameter(SpeechConstant.VOLUME, "80");// 设置音量，范围0~100
                mTts.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD); // 设置云端
                // 设置合成音频保存位置（可自定义保存位置），保存在“./sdcard/iflytek.pcm”
                // 保存在SD卡需要在AndroidManifest.xml添加写SD卡权限
                // 仅支持保存为pcm和wav格式，如果不需要保存合成音频，注释该行代码
//                mTts.setParameter(SpeechConstant.TTS_AUDIO_PATH, "./sdcard/iflytek.pcm");
                // 3.开始合成
                mTts.startSpeaking(tvContent.getText().toString(), null);
            }
        });
    }

    //弹出对话框提示安装所需的TTS数据
    private void alertInstallEyesFreeTTSData() {
        AlertDialog.Builder alertInstall = new AlertDialog.Builder(this)
                .setTitle("缺少需要的语音包")
                .setMessage("下载安装缺少的语音包")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                        //下载eyes-free的语音数据包
                        String ttsDataUrl = "http://eyes-free.googlecode.com/files/tts_3.1_market.apk";
                        Uri ttsDataUri = Uri.parse(ttsDataUrl);
                        Intent ttsIntent = new Intent(Intent.ACTION_VIEW, ttsDataUri);
                        startActivity(ttsIntent);
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                        finish();
                    }
                });
        alertInstall.create().show();

    }

}
