package 算数运算符;

public class DivTest {
    public static void main(String[] args) {
        double a = 5.2;
        double b = 3.1;
        double div = a/b;
        System.out.println(div);
        System.out.println("5除以0.0的结果是："+5/0.0);
        System.out.println("-5除以0.0的结果是："+ -5/0.0);
        System.out.println("-5除以0的结果是："+ -5/0);
    }
}
