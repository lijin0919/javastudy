package File类_1;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        FileTest fm=new FileTest();
        File file=new File("D:\\test.txt");
        //fm.create(file);
        fm.showFileInfo(file);
        //fm.delete(file);
    }

    /**
     * 创建文件的方法
     * @param file 文件对象
     */
    public void create(File file){
        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件已创建！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 删除文件
     * @param file 文件对象
     */
    public void delete(File file){
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除！");
        }
    }

    /**
     * 显示文件信息
     * @param file 文件对象
     */
    public void showFileInfo(File file){
        if(file.exists()){ //判断文件是否存在
            if(file.isFile()){ //如果是文件
                System.out.println("名称:" +  file .getName());
                System.out.println("相对路径: " + file.getPath());
                System.out.println("绝对路径: " + file.getAbsolutePath());
                System.out.println("文件大小:" + file.length()+ " 字节");
            }
            if(file.isDirectory()){
                System.out.println("此文件是目录");
            }
        }else
            System.out.println("文件不存在");
    }
}
