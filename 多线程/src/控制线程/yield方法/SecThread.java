package 控制线程.yield方法;

public class SecThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("第二个线程的第"+(i+1)+"次运行");
            Thread.yield();
        }
    }
}
