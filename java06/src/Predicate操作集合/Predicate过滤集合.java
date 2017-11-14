package Predicate操作集合;

import java.util.ArrayList;

/**
 * 批量删除符合条件的元素
 */
public class Predicate过滤集合 {
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


        arrayList.removeIf(a -> ((String)a).contains("风"));

        System.out.println(arrayList);

    }
}
