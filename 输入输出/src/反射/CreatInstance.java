package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreatInstance {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Person.class;
//        Person person = (Person) c.newInstance();
//
//        System.out.println(person);

        Constructor constructor = c.getConstructor(String.class);

        Person person = (Person) constructor.newInstance("你好");

        System.out.println(person.toString());
    }
}
