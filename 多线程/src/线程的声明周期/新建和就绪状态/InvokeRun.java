package 线程的声明周期.新建和就绪状态;

public class InvokeRun extends Thread {
    private int j;

    @Override
    public void run() {
        for (; j < 100; j++) {
            System.out.println(Thread.currentThread().getName()+" "+j);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);

            if (i == 20){
                //直接调用run（）
                //系统会把线程对象当成普通对象，把run()当成普通方法
                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }
}
