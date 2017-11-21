package 重定向标准IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 将system.out的输出重定向到文件输出，而不是屏幕
 */
public class RedirectOut {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("D://out.txt"));
            //将标准输出重定向到ps输出流
            System.setOut(ps);
            //向标准输出输出一个字符串
            System.out.println("普通字符串");
            //向标准输出输出一个对象
            System.out.println(new RedirectOut());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
