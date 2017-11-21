package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        //获取ClassTest对应的Class
        Class<ClassTest> c = ClassTest.class;
        //获取全部构造器
        Constructor[] constructors = c.getDeclaredConstructors();//获取全部构造器
        for (Constructor cc : constructors) {
            System.out.println(cc);
        }

        constructors = c.getConstructors();//获取public构造器
        for (Constructor cc : constructors) {
            System.out.println(cc);
        }


        Method[] methods = c.getMethods();//获取全部public方法
        for (Method method : methods) {
            System.out.println(method);
        }

        //带字符串参数的say方法
        System.out.println(c.getMethod("say",String.class));

    }
}
