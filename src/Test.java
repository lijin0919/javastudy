class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("开始");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("结束");
    }
}
public class Test {
    public static void test1(){
        System.out.println("test1开始");
        Thread t1 = new ThreadDemo();
        t1.start();
        System.out.println("test1结束");
    }
    public static void test2(){
        System.out.println("test2开始");
        Thread t2 = new ThreadDemo();
        t2.run();
        System.out.println("test2结束");
    }
    public static void main(String[] args) {
        test1();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
        test2();
    }
}
