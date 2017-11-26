package 控制线程.两个线程间的数据传递;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        thread.join();


//        Thread.sleep(1);
        System.out.println("values1:"+thread.value1);
        System.out.println("values2:"+thread.value2);
    }
}
