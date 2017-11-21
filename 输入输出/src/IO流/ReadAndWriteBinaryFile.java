package IO流;

import java.io.*;

public class ReadAndWriteBinaryFile {
    public static void main(String[] args) {
        DataInputStream dis=null;
        DataOutputStream dos=null;
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try {
            //创建输入流对象
            fis=new FileInputStream("H:\\star.jpg");
            dis=new DataInputStream(fis);
            //创建输出流对象
            fos=new FileOutputStream("D:\\star.jpg");
            dos=new DataOutputStream(fos);
            //读取文件并写入文件
            int temp;
            while((temp=dis.read())!=-1){
                System.out.println(temp);
                dos.write(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

            try {
                if(dis!=null){
                    dis.close();
                }
                if(dos!=null){
                    dos.close();
                }
                if(fis!=null){
                    fis.close();
                }
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
