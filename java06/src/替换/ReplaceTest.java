package 替换;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("力之涌现");
        arrayList.add("天之降诞");
        Collections.fill(arrayList,"东方不败");

        arrayList.add("地之觉醒");
        arrayList.add("水之生灵");
        arrayList.add("风之永动");
        arrayList.add("冰之固结");
        arrayList.add("命之主宰");
        arrayList.add("信仰之跃");

        arrayList.forEach(a -> System.out.println(a));
    }
}
