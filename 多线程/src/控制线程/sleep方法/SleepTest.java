package 控制线程.sleep方法;

import java.util.Date;

public class SleepTest {
    /**
     * 让当前正在执行的线程暂停一段时间，并进入阻塞状态
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前时间"+new Date());
            Thread.sleep(1000);
        }
    }
}
