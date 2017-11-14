package 自动类型转换;

public class PrimitiveAndString {
    public static void main(String[] args) {
//        String str1 = 5;
        String str2 = 3.5f+"";
        System.out.println(str2);
        System.out.println(3+4+"Hello");
        System.out.println("Hello"+3+4);
    }
}
