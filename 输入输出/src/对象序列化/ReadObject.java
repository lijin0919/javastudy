package 对象序列化;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\out.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p = (Person) ois.readObject();
            System.out.println(p.getName());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
