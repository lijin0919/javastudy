import java.awt.*;

public class FramTest {
    public static void main(String[] args) {
        Frame frame = new Frame("测试窗口");

        frame.setBounds(30,30,250,200);//位置大小
        frame.setVisible(true);//true:显示,false:不显示
    }

}
