package 遍历集合;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("cc");

        //传统fori
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        //增强foreach
//        for (Object a:arrayList) {
//            System.out.println(a);
//        }

        //lambda表达式
//        arrayList.forEach(a -> System.out.println(a));

//        arrayList.forEach(a -> System.out.println(a));

        //iterator遍历
        //用来遍历集合中的元素，被称为迭代器
//        Iterator iterator = arrayList.iterator();//获取迭代器
//        while (iterator.hasNext()){
//            Object o = iterator.next();
//            System.out.println(o);
//        }

        //
        Iterator iterator = arrayList.iterator();
        iterator.forEachRemaining(a -> System.out.println(a));


    }

}
