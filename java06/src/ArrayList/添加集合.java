package ArrayList;

import java.util.ArrayList;

public class 添加集合 {
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
        ArrayList arrayList1 = new ArrayList();
        arrayList1.addAll(arrayList);//把arrayList集合中的元素全部添加到arrayList1中
        System.out.println(arrayList1);
    }
}
