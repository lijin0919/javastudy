package 反射;

import java.lang.reflect.Array;

public class ArrayTest {

    public static void main(String[] args) {
        //创建一个String数组
        Object arr = Array.newInstance(String.class,10);

        Array.set(arr,5,"aaaaa");
        Array.set(arr,6,"bbbbbb");
        Object o1 = Array.get(arr,5);
        Object o2 = Array.get(arr,6);

        System.out.println(o1);
    }


}
