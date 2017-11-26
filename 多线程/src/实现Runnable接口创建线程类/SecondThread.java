package 实现Runnable接口创建线程类;

public class SecondThread implements Runnable{
private int j;

    @Override
    public void run() {
        for (; j < 100; j++) {
            System.out.println(Thread.currentThread().getName()+" "+j);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //获取当前线程
            System.out.println(Thread.currentThread().getName()+"  "+i);
            if (i==20){
               SecondThread secondThread =new SecondThread();
               new Thread(secondThread,"新线程1").start();
               new Thread(secondThread,"新线程2").start();
            }
        }
    }
}
