package 反射;

import java.lang.reflect.Constructor;

public class ClassDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Person person = new Person();

        Class cla = null;
//        cla = person.getClass();
//
//        cla = Person.class;


        cla = Class.forName("反射.Person");

        Constructor constructor = null;
        constructor = cla.getConstructor(String.class);
        System.out.println(constructor);
    }
}
