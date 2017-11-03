/**
 * 方法传递机制
 * 值传递：将实际参数的副本传入方法而参数本身不受任何影响
 */
public class demo1 {

    public static void add(int a, int b) {
        a = 1;
        b = 2;
        System.out.println("a:" + a + "\nb:" + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        add(a, b);
        System.out.println("外部a：" + a + "外部b：" + b);
    }
}
