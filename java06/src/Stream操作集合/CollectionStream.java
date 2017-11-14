package Stream操作集合;

import java.util.ArrayList;

public class CollectionStream {
    /**
     * 调用stream方法返回集合对应的stream，
     * 通过stream提供的方法对所有集合元素进行处理
     * @param args
     */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("力之涌现");
        arrayList.add("天之降诞");
        arrayList.add("地之觉醒");
        arrayList.add("水之生灵");
        arrayList.add("风之永动");
        arrayList.add("冰之固结");
        arrayList.add("命之主宰");
        arrayList.add("信仰之跃");

        //统计包含之的总数
        System.out.println(arrayList.stream().filter(a ->((String)a).contains("之")).count());

        System.out.println();
    }

}
