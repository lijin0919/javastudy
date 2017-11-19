public class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("线程函数执行体");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread t = new Thread(thread);
        t.start();//开启线程
    }


}
