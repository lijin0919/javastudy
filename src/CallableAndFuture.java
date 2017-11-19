import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
    //创建线程类
    public static class CallableTest implements Callable<String>{
        @Override
        public String call() throws Exception {
            return "Hello World";
        }
    }
    public static void main(String[] args) {
        ExecutorService threadPoll = Executors.newSingleThreadExecutor();
        //启动线程
        Future<String> future = threadPoll.submit(new CallableTest());
        try {
            System.out.println("waiting thread to finish");
            System.out.println(future.get());//等待线程结束，并获取返回结果
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
