package 线程同步.同步方法;

public class DrawThread extends Thread{

    //模拟用户账户
    private Account account;
    //当前取钱线程所希望取的钱数
    private  double drawAmount;
    public DrawThread(String name, Account account, double drawAmount){
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    //当多个线程修改同一个共享数据时，将涉及数据安全问题

    @Override
    public void run() {
        //直接调用account对象的draw方法来执行操作
        //同步方法的同步监视器是this，this代表调用draw方法的对象
        //也就是说，线程进入draw（）方法之前呢，必须先对account对象加锁
        account.draw(drawAmount);


    }
}
