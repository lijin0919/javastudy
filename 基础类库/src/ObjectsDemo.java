import java.util.Objects;

public class ObjectsDemo {
    /*
    java7新增
    操作对象
    ‘空指针’安全的
     */
    static ObjectsDemo objectsDemo;
    public static void main(String[] args) {
        System.out.println(Objects.hashCode(objectsDemo));
        System.out.println(Objects.toString(objectsDemo));
    }
}
