package 面向接口编程;

public class AI {
    private T t;

    public AI(T t) {
        this.t = t;
    }

    public void make(){
        t.say();
    }
}
