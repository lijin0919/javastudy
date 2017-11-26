package 控制线程.yield方法;

public class Test {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecThread secThread = new SecThread();
        firstThread.start();
        secThread.start();
    }
}
