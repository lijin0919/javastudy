package 线程的声明周期.线程死亡;

/**
 * 线程结束后处于死亡：
 * 1、run()或call()方法执行完成，线程正常结束
 * 2、线程抛出一个未捕获的异常
 * 3、直接调用stop（），容易导致死锁，不推荐
 */

public class StartDead extends Thread{
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        StartDead startDead = new StartDead();
        for (int i = 0; i < 100; i++) {
            //获取当前线程
            System.out.println(Thread.currentThread().getName()+" "+i);

            if (i==20){
                startDead.start();
                //线程处于新建和死亡两种状态是，返回false
                System.out.println(startDead.isAlive());//判断启动后的线程是否死亡

            }

            if (i>20&&!startDead.isAlive()){
                startDead.start();
            }
        }
    }
}
