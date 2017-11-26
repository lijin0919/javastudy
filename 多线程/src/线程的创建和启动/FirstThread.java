package 线程的创建和启动;

/**
 * 通过继承Thread类创建线程类
 */
public class FirstThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //获取当前线程
            System.out.println("这个是主线程");
            if (i==20){
                new FirstThread().start();
                new FirstThread().start();

            }
        }
    }
}
