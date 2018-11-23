package acc.tulip.com.socketclient;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lcy on 2018/11/22.
 */

public class ScreenDataBean implements Serializable {

    /**
     * root : {"screen":{"displays":{"display":[{"textColor":"#2C815B","rows":"1","space":"9","textSize":"40","id":"xn02","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"123","left":"245","columns":"1","type":"table","eWidth":"200","elements":{"xh":{"aligntype":"LEFT","textColor":"#ab331f","text":"27","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"40","id":"xn03","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"115","left":"500","columns":"1","type":"table","eWidth":"200","elements":{"xm":{"aligntype":"LEFT","textColor":"#ab331f","text":"汪 * 英","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"40","id":"ks","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"115","left":"795","columns":"1","type":"table","eWidth":"200","elements":{"ksmc":{"aligntype":"LEFT","textColor":"#ab331f","text":"测试","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs11","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"252","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br11":{"aligntype":"LEFT","textColor":"#2C815B","text":"30","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs12","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"248","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br12":{"aligntype":"CENTER_HORIZONTAL","textColor":"#2C815B","text":"赵 * 杰","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs21","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"306","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br21":{"aligntype":"LEFT","textColor":"#2C815B","text":"31","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs22","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"300","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br22":{"aligntype":"LEFT","textColor":"#2C815B","text":"蒋 * 方","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs31","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"357","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br31":{"aligntype":"LEFT","textColor":"#2C815B","text":"32","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs32","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"351","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br32":{"aligntype":"LEFT","textColor":"#2C815B","text":"翁 * 英","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs41","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"409","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br41":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs42","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"399","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br42":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs51","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"459","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br51":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs52","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"455","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br52":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs61","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"511","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br61":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs62","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"506","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br62":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs71","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"563","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br71":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs72","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"556","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br72":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs81","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"616","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br81":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs82","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"610","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br82":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}}]},"next":"","id":"jiaohaoconfig","during":"3000"}}
     */

    private RootBean root;

    public RootBean getRoot() {
        return root;
    }

    public void setRoot(RootBean root) {
        this.root = root;
    }

    public static class RootBean {
        /**
         * screen : {"displays":{"display":[{"textColor":"#2C815B","rows":"1","space":"9","textSize":"40","id":"xn02","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"123","left":"245","columns":"1","type":"table","eWidth":"200","elements":{"xh":{"aligntype":"LEFT","textColor":"#ab331f","text":"27","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"40","id":"xn03","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"115","left":"500","columns":"1","type":"table","eWidth":"200","elements":{"xm":{"aligntype":"LEFT","textColor":"#ab331f","text":"汪 * 英","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"40","id":"ks","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"115","left":"795","columns":"1","type":"table","eWidth":"200","elements":{"ksmc":{"aligntype":"LEFT","textColor":"#ab331f","text":"测试","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs11","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"252","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br11":{"aligntype":"LEFT","textColor":"#2C815B","text":"30","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs12","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"248","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br12":{"aligntype":"CENTER_HORIZONTAL","textColor":"#2C815B","text":"赵 * 杰","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs21","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"306","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br21":{"aligntype":"LEFT","textColor":"#2C815B","text":"31","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs22","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"300","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br22":{"aligntype":"LEFT","textColor":"#2C815B","text":"蒋 * 方","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs31","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"357","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br31":{"aligntype":"LEFT","textColor":"#2C815B","text":"32","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs32","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"351","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br32":{"aligntype":"LEFT","textColor":"#2C815B","text":"翁 * 英","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs41","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"409","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br41":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs42","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"399","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br42":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs51","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"459","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br51":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs52","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"455","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br52":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs61","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"511","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br61":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs62","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"506","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br62":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs71","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"563","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br71":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs72","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"556","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br72":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs81","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"616","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br81":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs82","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"610","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br82":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}}]},"next":"","id":"jiaohaoconfig","during":"3000"}
         */

        private ScreenBean screen;

        public ScreenBean getScreen() {
            return screen;
        }

        public void setScreen(ScreenBean screen) {
            this.screen = screen;
        }

        public static class ScreenBean {
            /**
             * displays : {"display":[{"textColor":"#2C815B","rows":"1","space":"9","textSize":"40","id":"xn02","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"123","left":"245","columns":"1","type":"table","eWidth":"200","elements":{"xh":{"aligntype":"LEFT","textColor":"#ab331f","text":"27","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"40","id":"xn03","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"115","left":"500","columns":"1","type":"table","eWidth":"200","elements":{"xm":{"aligntype":"LEFT","textColor":"#ab331f","text":"汪 * 英","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"40","id":"ks","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"115","left":"795","columns":"1","type":"table","eWidth":"200","elements":{"ksmc":{"aligntype":"LEFT","textColor":"#ab331f","text":"测试","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs11","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"252","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br11":{"aligntype":"LEFT","textColor":"#2C815B","text":"30","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs12","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"248","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br12":{"aligntype":"CENTER_HORIZONTAL","textColor":"#2C815B","text":"赵 * 杰","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs21","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"306","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br21":{"aligntype":"LEFT","textColor":"#2C815B","text":"31","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs22","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"300","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br22":{"aligntype":"LEFT","textColor":"#2C815B","text":"蒋 * 方","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs31","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"357","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br31":{"aligntype":"LEFT","textColor":"#2C815B","text":"32","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs32","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"351","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br32":{"aligntype":"LEFT","textColor":"#2C815B","text":"翁 * 英","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs41","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"409","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br41":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs42","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"399","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br42":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs51","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"459","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br51":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs52","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"455","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br52":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs61","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"511","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br61":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs62","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"506","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br62":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs71","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"563","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br71":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs72","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"556","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br72":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"30","id":"brs81","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"616","left":"860","columns":"1","type":"table","eWidth":"200","elements":{"br81":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"40"}}},{"textColor":"#2C815B","rows":"1","space":"9","textSize":"36","id":"brs82","eHeight":"50","aligntype":"CENTER_HORIZONTAL","top":"610","left":"1000","columns":"1","type":"table","eWidth":"200","elements":{"br82":{"aligntype":"LEFT","textColor":"#2C815B","text":"","textSize":"36"}}}]}
             * next :
             * id : jiaohaoconfig
             * during : 3000
             */

            private DisplaysBean displays;
            private String next;
            private String id;
            private String during;

            public DisplaysBean getDisplays() {
                return displays;
            }

            public void setDisplays(DisplaysBean displays) {
                this.displays = displays;
            }

            public String getNext() {
                return next;
            }

            public void setNext(String next) {
                this.next = next;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getDuring() {
                return during;
            }

            public void setDuring(String during) {
                this.during = during;
            }

            public static class DisplaysBean {
                private List<DisplayBean> display;

                public List<DisplayBean> getDisplay() {
                    return display;
                }

                public void setDisplay(List<DisplayBean> display) {
                    this.display = display;
                }

                public static class DisplayBean {
                    /**
                     * textColor : #2C815B
                     * rows : 1
                     * space : 9
                     * textSize : 40
                     * id : xn02
                     * eHeight : 50
                     * aligntype : CENTER_HORIZONTAL
                     * top : 123
                     * left : 245
                     * columns : 1
                     * type : table
                     * eWidth : 200
                     * elements : {"xh":{"aligntype":"LEFT","textColor":"#ab331f","text":"27","textSize":"40"}}
                     */

                    private String textColor;
                    private String rows;
                    private String space;
                    private String textSize;
                    private String id;
                    private String eHeight;
                    private String aligntype;
                    private String top;
                    private String left;
                    private String columns;
                    private String type;
                    private String eWidth;
                    private ElementsBean elements;

                    public String getTextColor() {
                        return textColor;
                    }

                    public void setTextColor(String textColor) {
                        this.textColor = textColor;
                    }

                    public String getRows() {
                        return rows;
                    }

                    public void setRows(String rows) {
                        this.rows = rows;
                    }

                    public String getSpace() {
                        return space;
                    }

                    public void setSpace(String space) {
                        this.space = space;
                    }

                    public String getTextSize() {
                        return textSize;
                    }

                    public void setTextSize(String textSize) {
                        this.textSize = textSize;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getEHeight() {
                        return eHeight;
                    }

                    public void setEHeight(String eHeight) {
                        this.eHeight = eHeight;
                    }

                    public String getAligntype() {
                        return aligntype;
                    }

                    public void setAligntype(String aligntype) {
                        this.aligntype = aligntype;
                    }

                    public String getTop() {
                        return top;
                    }

                    public void setTop(String top) {
                        this.top = top;
                    }

                    public String getLeft() {
                        return left;
                    }

                    public void setLeft(String left) {
                        this.left = left;
                    }

                    public String getColumns() {
                        return columns;
                    }

                    public void setColumns(String columns) {
                        this.columns = columns;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getEWidth() {
                        return eWidth;
                    }

                    public void setEWidth(String eWidth) {
                        this.eWidth = eWidth;
                    }

                    public ElementsBean getElements() {
                        return elements;
                    }

                    public void setElements(ElementsBean elements) {
                        this.elements = elements;
                    }

                    public static class ElementsBean<Parent> implements Serializable{
                        /**
                         * xh : {"aligntype":"LEFT","textColor":"#ab331f","text":"27","textSize":"40"}
                         */
//                      private XhBean xh;
                        private Parent t;

                        public Parent getT() {
                            return t;
                        }

                        public void setT(Parent t) {
                            this.t = t;
                        }

                        public static class  Parent implements Serializable{
                            /**
                             * aligntype : LEFT
                             * textColor : #ab331f
                             * text : 27
                             * textSize : 40
                             */

                            private String aligntype;
                            private String textColor;
                            private String text;
                            private String textSize;

                            public String getAligntype() {
                                return aligntype;
                            }

                            public void setAligntype(String aligntype) {
                                this.aligntype = aligntype;
                            }

                            public String getTextColor() {
                                return textColor;
                            }

                            public void setTextColor(String textColor) {
                                this.textColor = textColor;
                            }

                            public String getText() {
                                return text;
                            }

                            public void setText(String text) {
                                this.text = text;
                            }

                            public String getTextSize() {
                                return textSize;
                            }

                            public void setTextSize(String textSize) {
                                this.textSize = textSize;
                            }
                        }
                    }
                }
            }
        }
    }
}
