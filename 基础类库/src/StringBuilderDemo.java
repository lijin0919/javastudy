/*
字符序列可变的字符串
性能高
没有实现线程安全
 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("冰冰");
        stringBuilder.insert(0,"我爱你");
        stringBuilder.replace(3,4,",");
        stringBuilder.delete(3,4);
        stringBuilder.reverse();
        stringBuilder.length();
        stringBuilder.capacity();
        System.out.println(stringBuilder);
    }
}
