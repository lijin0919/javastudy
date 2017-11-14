import java.util.HashSet;

/*
Set集合无序，不允许包含相同元素

 */
public class HashSetDemo {
    /*
    存取和查找性能高
    特点：
    1、顺序可能与添加的顺序不同
    2、不是同步的
    3、允许元素值是null

    向hashset集中中存入一个元素时，HashSet会调用对象的hashCode（）方法来得到该对象
    的hashCode值，来决定存储位置
     */

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new A());
        hashSet.add(new A());
        hashSet.add(new B());
        hashSet.add(new B());
        hashSet.add(new C());
        hashSet.add(new C());
        System.out.println(hashSet);
    }
}

/**
 * hashset判断两个元素相等的标准是通过equals和hashcode方法比较都相等
 *
 * 如果两个对象通过equals方法比较返回true，hashcode值也应相等
 */
class A{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

class B{
    @Override
    public int hashCode() {
        return 1;
    }
}

class C{
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}