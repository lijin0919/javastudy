package IO流;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("G:\\poem.txt");
            fileWriter.write("aaaaa");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
