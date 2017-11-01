public class SortNum {
    public static void main(String[] args) {
        // 1.定义排序数组
        int[] arr = { 4, 7, 3, 9, 1 };
        int min = -1; // 最小值下标
        int temp = 0;
        // 外层循环：控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;  //每轮min初始值为i
            // 内层循环：当前下标为i的元素分别和后面的元素比较，将最小值的下标记录在min中
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            //如果min的值改变了，则交换
            if(min!=-1){
                temp = arr[min];
                arr[min] = arr[i];
                arr[i]=temp;
            }
        }

        //输出排序后的数组
        for(int num:arr){
            System.out.print(num+"\t");
        }
    }
}
