package Collections工具类;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);

        Collections.reverse(nums);//次序反转
        Collections.sort(nums);//自然次序
        Collections.shuffle(nums);//随机

    }
}
