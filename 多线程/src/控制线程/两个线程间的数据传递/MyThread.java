package 控制线程.两个线程间的数据传递;

public class MyThread extends Thread{

    public String value1;
    public String value2;

    @Override
    public void run() {
        value1 = "v111111111111111";
        value2 = "v222222222222222";
    }


}
