package IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try {
            FileReader fileReader =
                    new FileReader("G:\\课程\\研发40\\javastudy\\输入输出\\src\\IO流\\FileReaderTest.java");
            char[] chars = new char[32];
            int hasRead = 0;
            while ((hasRead = fileReader.read(chars))>0){
                System.out.println(new String(chars,0,hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
