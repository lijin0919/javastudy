package 控制线程.sleep方法;

public class Wait {

    public static void bySec(long s){
        for (int i = 0; i < s; i++) {
            System.out.println(i+1+"秒");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
