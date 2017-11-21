package 反射;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }



    public void say(String name){
        System.out.println("心好累");
    }



    public Person(String name) {
        System.out.println("String构造");
    }

    @Override
    public String toString() {
        System.out.println(name);

        return "哈哈哈哈";
    }
}
