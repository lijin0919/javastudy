/**
 * 对象、引用、指针
 */
public class demo2 {
    //引用变量里存放的仅仅是一个引用，指向知己对象
    //垃圾回收：gc（Gabage Collection）

    /**
     * 如果内存中的对象没有任何变量指向该对象，那么程序将无法再访问该对象
     * 这个对象也就变成了垃圾，java的gc机制会回收垃圾，释放内存
     * 如果希望通知gc机制回收某个对象，只需要切断所有对该对象的引用
     * person1 = null
     * @param args
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "a";
        person1.age = 1;
        Person person2 = person1;
        person2.name = "b";
        person2.age = 2;
        System.out.println(person1.name+""+person1.age);
        person1 = null;
    }

}
