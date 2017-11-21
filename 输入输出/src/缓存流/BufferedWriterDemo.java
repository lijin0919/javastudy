package 缓存流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("G:\\tt.txt");

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("aaaaaaaaaaaaaa");
            bw.newLine();
            bw.write("bbbbbbbbbbbbbbbbbb");
            bw.flush();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
