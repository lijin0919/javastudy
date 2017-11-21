package File类_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        File file = new File("D:\\text.txt");
        try {
            file.createNewFile();
            FileInputStream fileInputStream = new FileInputStream("D:\\text.txt");
            byte[] bytes = new byte[10];
            int i = fileInputStream.read(bytes);
            System.out.println(i);





        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
