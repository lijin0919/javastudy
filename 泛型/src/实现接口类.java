public class 实现接口类<T> implements 泛型接口<T> {

    T name;

    public 实现接口类(T name) {
        this.name = name;
    }

    @Override
    public T jiao() {
        return name;
    }
}
