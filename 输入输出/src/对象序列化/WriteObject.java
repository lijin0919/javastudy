package 对象序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        //创建一个objectoutputstream输出流
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("D://out.txt"));
            Person person = new Person();
            person.setAge(10);
            person.setName("asdad");
            oos.writeObject(person);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
