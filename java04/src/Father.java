public class Father {

    public String name;
    public int age;

    public Father() {
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getNumber(){
        System.out.println("我是父类方法");
    }
}
