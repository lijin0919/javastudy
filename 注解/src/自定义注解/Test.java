package 自定义注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    //成员变量以方法的形式来定义
    String name() default "bbb";
    int age() default 100;

}
