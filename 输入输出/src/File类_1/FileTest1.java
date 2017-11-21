package File类_1;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) {
        File file = new File("D:\\wjj\\file.txt");
        try {
//            boolean c = file.mkdir();
//            System.out.println(c);
            boolean b = file.createNewFile();
            System.out.println(b);
            boolean e= file.exists();
            System.out.println(e);
            boolean d =file.delete();
            System.out.println(d);

        } catch (Exception e) {
            e.printStackTrace();
        }


//        String[] s= file.list();
//        System.out.println(s.length);

//
    }




}
