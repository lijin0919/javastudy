package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream =
                    new FileInputStream("G:\\课程\\研发40\\javastudy\\输入输出\\src\\IO流\\FileOutputStreamTest.java");
            FileOutputStream fileOutputStream =
                    new FileOutputStream("H:\\newFile.txt");
            byte[] bytes = new byte[32];
            int hasRead = 0;
            while ((hasRead = fileInputStream.read(bytes))>0){
                fileOutputStream.write(bytes,0,hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
