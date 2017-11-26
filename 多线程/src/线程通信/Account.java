package 线程通信;

public class Account {
    //封装账户编号、账户余额的两个成员变量
    private String accountNo;
    private double balance;

    private boolean flag = false;


    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }


    //提供一个线程安全的draw（）方法来完成取钱操作
    public synchronized void draw(double drawAmount){

        try{
            //如果为家，表明账户中还没有人存款，取钱方法阻塞
            if (!flag){
                wait();
            }else {
                System.out.println(Thread.currentThread().getName()
                +"取钱"+drawAmount);
                balance -=drawAmount;
                System.out.println("账户余额为："+balance);
                flag = false;
                //唤醒其他
                notifyAll();
            }

        }catch (Exception e){

        }

    }

    public synchronized void deposit(double depositAmount){
        try{
            //如果flag为true，表明账户中已经有人存钱进去，存钱方法阻塞
            if (flag){
                wait();
            }else {
                //执行存款操作
                System.out.println(Thread.currentThread().getName()
                +"存款："+ depositAmount);
                balance +=depositAmount;
                System.out.println("账户余额为："+balance);
                flag = true;
                notifyAll();
            }
        }catch (Exception e){

        }
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj!=null&&obj.getClass()== Account.class){
            Account target = (Account)obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }




    public Account(){
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
