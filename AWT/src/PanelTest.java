import java.awt.*;

public class PanelTest {
    public static void main(String[] args) {
        Frame frame = new Frame("panel测试");
        Panel panel = new Panel();
        panel.add(new TextField(20));
        panel.add(new Button("点击我"));
        frame.add(panel);
        frame.setBounds(100,100,500,500);
        frame.setVisible(true);
    }
}
