package Collections工具类;

import java.util.ArrayList;
import java.util.Collections;

public class SearchTest {

    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        Collections.max(nums);//最大元素
        Collections.min(nums);//最小元素
        Collections.replaceAll(nums,0,1);//将0用1替代
        Collections.frequency(nums,-5);//-5出现的次数
        Collections.sort(nums);
        Collections.binarySearch(nums,3);//先排序再二分
    }
}
