package 抽象类;

public class Student extends Person{

    public String name;
    public int age;

    @Override
    public String toString() {
        return "name:"+name+"age:"+age;
    }

    @Override
    public void say() {

    }
}
