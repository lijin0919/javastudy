package 面向接口编程;

public class Test {

    public static void main(String[] args) {
        TFactory factory = new TFactory();
        AI ai = new AI(factory.getT());

        ai.make();
    }
}
