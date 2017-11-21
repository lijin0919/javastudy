package 反射;

public class ClassTest {
    public ClassTest() {
    }


    private ClassTest(int a){
        System.out.println("私有构造器");
    }

    public ClassTest(String name){
        System.out.println("有参构造器");
    }


    public void say(){
        System.out.println("无参数say方法");
    }

    public void say(String s){
        System.out.println("有参数say方法");
    }


}
