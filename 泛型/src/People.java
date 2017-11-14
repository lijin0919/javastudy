public class People<T> {
    private T info;

    public People(T info) {
        this.info = info;
    }

    public void show(){
        System.out.println(info);
    }
}
