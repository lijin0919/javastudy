package IO流;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream =
                new FileInputStream("H:\\课程\\研发40\\javastudy\\输入输出\\src\\IO流\\FileInputStreamTest.java");
        byte[] bbuf = new byte[1024];
        int hasRead = 0;
        while ((hasRead = fileInputStream.read(bbuf))>0){
            System.out.println(new String(bbuf,0,hasRead));
        }
        fileInputStream.close();
    }
}
