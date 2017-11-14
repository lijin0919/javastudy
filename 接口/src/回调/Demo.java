package 回调;

public class Demo {

    public void result(int a,ResultListener resultListener){
        if (a<10){
            resultListener.success();
        }else {
            resultListener.fail();
        }
    }

}
