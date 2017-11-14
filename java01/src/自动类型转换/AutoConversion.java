package 自动类型转换;

public class AutoConversion {
    public static void main(String[] args) {
        int a = 6;
        //int可以自动转换为float类型
        float f = a;
        System.out.println(f);

        byte b = 9;
//        char c = b;
        double d = b;
        System.out.println(d);
    }


}
