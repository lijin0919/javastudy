package duotai;

public class Test {
    public static void main(String[] args) {
        /*
            一个plane变量既可以引用一个plane
            类对象，也可以引用一个plane类的任何一个子类
         */
//        Plane plane = new F35();
//        plane.fly();
        F35 f35 = (F35) new Plane();
        f35.say();
//        Plane plane = new Plane();
//        if (plane instanceof F35){
//            F35 f351 = (F35) plane;
//            System.out.println("转换成功");
//        }


    }
}
