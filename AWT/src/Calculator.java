import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator extends JFrame{
    public static void main(String[] args) {
        // Create application frame.
        Calculator frame = new Calculator();

        frame.setTitle("计算器");
        frame.setSize(240, 320);
        frame.setResizable(false);//值为true时，表示在生成的窗体可以自由改变大小
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);//程序的退出

        frame.init();

        // Show frame
        frame.setVisible(true);
    }

    private void init()
    {
        textField = new JTextField();
        textField.setEditable(false);//不可编辑
        textField.setHorizontalAlignment (JTextField.RIGHT);//右对齐
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));//网格布局

        Container container = getContentPane();//初始化一个容器，用来在容器上添加一些控件
        container.add(textField, BorderLayout.NORTH);
        container.add(panel, BorderLayout.CENTER);

        panel.add(useButton('7'));
        panel.add(useButton('8'));
        panel.add(useButton('9'));
        panel.add(useButton('+'));
        panel.add(useButton('4'));
        panel.add(useButton('5'));
        panel.add(useButton('6'));
        panel.add(useButton('-'));
        panel.add(useButton('1'));
        panel.add(useButton('2'));
        panel.add(useButton('3'));
        panel.add(useButton('*'));
        panel.add(useButton('0'));
        panel.add(useButton('.'));
        panel.add(useButton('='));
        panel.add(useButton('/'));
    }

    public JButton useButton (final char key)
    {
        JButton button = new JButton(String.valueOf(key));//转换字符串

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                JButton btn = (JButton) event.getSource();
                char key2 = btn.getText().charAt(0);

                action(key2);
            }
        });
        button.addKeyListener(new KeyAdapter()
        {
            public void keyReleased(KeyEvent event)
            {
                char key2 = event.getKeyChar ();

                //if(key2 != key)
                //  return;

                action(key2);
            }
        });

        return button;
    }

    private void action(char key2)
    {
        if(reop)
        {
            textField.setText("");
            reop = false;
        }

        switch(key2)
        {
            case '+':
                v1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = '+';
                break;
            case '-':
                v1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = '-';
                break;
            case '*':
                v1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = '*';
                break;
            case '/':
                v1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operator = '/';
                break;
            case '=':
                reop = true;
                v2 = Double.parseDouble(textField.getText());
                switch(operator)
                {
                    case '+':
                        value = v1 + v2;
                        break;
                    case '-':
                        value = v1 - v2;
                        break;
                    case '*':
                        value = v1 * v2;
                        break;
                    case '/':
                        value = v1 / v2;
                        break;
                    default: ;
                }
                textField.setText(String.valueOf(value));
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '0':
            case '.':
                String text = textField.getText() + key2;
                textField.setText(text);
                break;
            default: ;
        }
    }
    private JTextField textField;
    private double v1, v2, value;
    private char operator;
    private boolean reop = false;
}
