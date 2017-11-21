package 重定向标准IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RedirectIn {
    public static void main(String[] args) {
        try {
            FileInputStream fis =
                    new FileInputStream("H:\\课程\\研发40\\javastudy\\输入输出\\src\\重定向标准IO\\RedirectIn.java");
            //将标准输入重定向到fis输入流
            System.setIn(fis);
            //创建Scanner对象
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");//只把回车作为换行
            while (sc.hasNext()){
                System.out.println("键盘输入的内容是："+sc.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
