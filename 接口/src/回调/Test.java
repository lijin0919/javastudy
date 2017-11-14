package 回调;

public class Test {



    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.result(5, new ResultListener() {
            @Override
            public void success() {
                System.out.println("恭喜");
            }

            @Override
            public void fail() {
                System.out.println("对不起");
            }
        });
    }

}
