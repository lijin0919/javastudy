public class Son extends Father {

    public String sex;

    public Son() {
    }

    public Son(String name, int age, String sex) {
        super(name, age);
        this.sex = sex;
    }

    @Override
    public void getNumber() {
        super.getNumber();//调用父类中被覆盖的方法
        System.out.println("我是子类方法");
    }
}
