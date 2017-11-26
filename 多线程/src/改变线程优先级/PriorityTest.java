package 改变线程优先级;

public class PriorityTest extends Thread{

    public PriorityTest(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName()+",其优" +
                    "先级是："+getPriority()+",循环标" +
                    "量的值为："+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //改变主线程优先级
        for (int i = 0; i < 30; i++) {
            if (i==10){
                PriorityTest low = new PriorityTest("低级");
                low.start();

                System.out.println("创建之初的优先级："+low.getPriority());
                //设置该线程为最低优先级
                low.setPriority(Thread.MIN_PRIORITY);
            }

            if(i==20){
                PriorityTest high = new PriorityTest("高级");
                high.start();
                System.out.println("创建之初的优先级："+high.getPriority());
                high.setPriority(Thread.MAX_PRIORITY);

            }
        }
    }
}
