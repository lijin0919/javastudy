package 反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取class对象
        Class c = Person.class;

        Person person = new Person();
        Method method = c.getMethod("setName", String.class);
        method.invoke(person,"唉唉");
        System.out.println(person.toString());
    }




}
