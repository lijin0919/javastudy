/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] unsorted = {6, 2, 4, 1, 5, 9};
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println("i等于"+i);
            for (int j = i; j < unsorted.length; j++) {
                if (unsorted[i] > unsorted[j]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;

                }
            }
        }

        for (int x : unsorted
                ) {
            System.out.println(x);
        }
    }
}
