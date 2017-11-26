package 线程通信;

public class DrawTest {


    public static void main(String[] args) {
        //创建一个账户
        Account account = new Account("1234567",0);
        //模拟两个线程对同一个账户取钱
        new DrawThread("取钱",account,800).start();
        new DepositThread("存款1",account,800).start();
//        new DepositThread("存款2",account,800).start();
//        new DepositThread("存款3",account,800).start();
    }
}
