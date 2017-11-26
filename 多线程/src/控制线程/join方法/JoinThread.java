package 控制线程.join方法;

/**
 * 让线程等待另一个线程完成的方法
 *
 * 调用线程将被阻塞，直到加入的线程结束
 */
public class JoinThread extends Thread{

    public JoinThread(String name){
        super(name);
    }

    //定义线程执行体
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+" "+i);

        }
    }

    public static void main(String[] args) throws InterruptedException {
        //启动子线程
        new JoinThread("新线程").start();
        Thread.sleep(1000);
        for (int i = 0; i < 100; i++) {
            if (i==20){
                JoinThread joinThread = new JoinThread("被Join的线程");
                joinThread.start();

                //main线程要等待被join的线程结束才能继续执行
                /*
                join(long millis):等待被join的线程的时间最长为millis毫秒
                如果在millis毫秒内被join的线程还没有执行结束，则不再等待
                 */

                joinThread.join();
                Thread.sleep(1000);
            }

            System.out.println(Thread.currentThread().getName()+"   "+i);
        }
    }
}
