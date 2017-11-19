public class ForTest {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println("循环结束");


        //for循环允许同时指定多个初始化语句，循环条件也是一个包含运算符的表达式
        for (int b = 0, s = 0, p = 0; b < 10 && s < 4 && p < 10; p++) {
            System.out.println(b++);
            System.out.println(++s + p);
            System.out.println("*************************************");
        }
    }
}
