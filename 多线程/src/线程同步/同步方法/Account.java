package 线程同步.同步方法;

public class Account {
    //封装账户编号、账户余额的两个成员变量
    private String accountNo;
    private double balance;

    //提供一个线程安全的draw（）方法来完成取钱操作
    public synchronized void draw(double drawAmount){
        //账户余额大于取钱数目
        if(balance >= drawAmount){
            //吐出钞票
            System.out.println(Thread.currentThread().getName()+"取钱成功！吐出钞票："+drawAmount);

            try{
                Thread.sleep(1);
            }catch (Exception e){

            }

            //修改余额
            balance -= drawAmount;
            System.out.println("余额为："+balance);
        }else{
            System.out.println(Thread.currentThread().getName()+"取钱失败！余额不足！");
        }
    }


    @Override
    public int hashCode() {
        return accountNo.hashCode();
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
