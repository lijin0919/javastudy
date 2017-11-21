package 缓存流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("G:\\poem.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line!=null){
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
