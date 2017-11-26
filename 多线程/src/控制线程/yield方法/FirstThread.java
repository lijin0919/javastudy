package 控制线程.yield方法;

public class FirstThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("第一个线程的第"+(i+1)+"次运行");
            Thread.yield();//暂停线程
            /*
            此时不会阻塞，仍处于可运行状态
             */
        }
    }
}
