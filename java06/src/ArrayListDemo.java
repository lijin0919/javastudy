import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("aa");
        arrayList1.add("bb");
        arrayList1.add("cc");
        ArrayList arrayList2 = new ArrayList();
        //将指定的元素附加到此列表的末尾。
        arrayList2.add("a");
        arrayList2.add("b");
        arrayList2.add("c");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        arrayList2.add("a");
        //将指定的元素插入此列表中的指定位置。
//        arrayList2.add(0,"d");

        //将指定集合中的所有元素插入到列表中，从指定的位置开始。
//        arrayList2.addAll(0,arrayList1);
        //将指定集合中的所有元素附加到此列表的末尾，按照它们由指定集合的​​Iterator返回的顺序。
//        arrayList2.addAll(arrayList1);


        //删除此列表中的所有元素。
//        arrayList2.clear();

        //返回此ArrayList实例副本。
//        ArrayList arrayList2 = (ArrayList) arrayList.clone();

//
        //true如果此列表包含指定的元素，则返回。
//        boolean result = arrayList2.contains("a");
//        System.out.println(result);
        //返回列表中指定位置的元素。
//        String result = (String) arrayList.get(0);

        //返回此列表中指定元素第一次出现的索引;如果此列表不包含元素，则返回-1。
//        int result =  arrayList2.indexOf("a");
//        System.out.println(result);
        //如果此列表不包含元素，则返回true
//        boolean result = arrayList2.isEmpty();
//        System.out.println(result);
        //返回此列表中指定元素的最后一次出现的索引;如果此列表不包含元素，则返回-1。
//        int result = arrayList2.lastIndexOf("a");
//        System.out.println(result);
        //删除列表中指定位置的元素。
//        arrayList2.remove(0);
        //如果存在，则从此列表中删除指定元素的第一个匹配项。
//        arrayList.remove("a");
        //用指定的元素替换此列表中指定位置的元素
//        arrayList.set(0,"aaa");
        //返回此列表中元素的数量。
//        int a = arrayList.size();
        System.out.println(arrayList2);


    }
}
