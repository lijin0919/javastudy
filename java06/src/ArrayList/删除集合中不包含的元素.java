package ArrayList;

import java.util.ArrayList;

public class 删除集合中不包含的元素 {
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
        arrayList1.add("天之降诞");

        arrayList1.retainAll(arrayList);//交集
        System.out.println(arrayList1);
    }
}
