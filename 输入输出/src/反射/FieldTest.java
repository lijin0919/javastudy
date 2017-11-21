package 反射;

import java.lang.reflect.Field;

public class FieldTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        Person person = new Person();
        Class c = Person.class;
        //获取名为name的成员变量
        Field fieldName = c.getDeclaredField("name");

        fieldName.setAccessible(true);//取消访问权限检查

        //为成员变量赋值
        fieldName.set(person,"aaaaaa");

        System.out.println(person.toString());
    }

}
