package 算数运算符;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ComparableOperatorTest {

    public static void main(String[] args) {
        System.out.println("5是否大于4.0：" + (5 > 4.0));
        System.out.println("5和5.0是否相等：" + (5 == 5.0));
        System.out.println("97是否和a相等：" + (97 == 'a'));
        System.out.println("true和false是否相等：" + (true == false));

        System.out.println(!false);
        System.out.println(5 > 3 && '6' > 10);
        System.out.println(4 >= 5 || 'c' > 'a');

        int a = 5;
        int b = 10;
        if (a > 4 | b++ > 10) {
            System.out.println(a);
            System.out.println(b);
        }

        int c = 5;
        int d = 10;
        if(c>4||d++>10){
            System.out.println(c);
            System.out.println(d);
        }
    }
}
