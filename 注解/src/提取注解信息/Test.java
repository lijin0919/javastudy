package 提取注解信息;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Annotation[] annotations =
                Class.forName("自定义注解.MyTest")
                        .getMethod("say")
                        .getAnnotations();
        for (Annotation a:annotations
             ) {
            System.out.println(a);
        }
    }
}
