import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        //equals(array1,array2) 的作用是：比较两个数组是否相等
        System.out.println("----equals(array1,array2)方法：----");
        int [] arr1 = {10,50,40,30};
        int [] arr2 = {10,50,40,30};
        int [] arr3 = {60,50,85};
        //判断arr1与arr2的长度及元素是否相等
        System.out.println("数组比较结果："+Arrays.equals(arr1, arr2));
        //判断arr1与arr3的长度及元素是否相等
        System.out.println("数组比较结果："+Arrays.equals(arr1, arr3));

        //sort(array) 的作用是：对数组array的元素进行升序排列
        System.out.println("----sort(array)方法：----");
        int [] array = new int[]{80,66,70,54,98};
        Arrays.sort(array);
        System.out.println("成绩排序后：");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //toString(array) 的作用是：将一个数组array转换成一个字符串
        System.out.println("----toString(array)方法：----");
        int[] arr = { 10, 50, 40, 30 };
        Arrays.sort(arr); 								//将数组按升序排列
        System.out.println(Arrays.toString(arr)); 		//将数组arr转换为字符串并输出

        //fill(array,val) 的作用是：把数组array的所有元素都赋值为val
        System.out.println("----fill(array,val)方法：----");
        int[] arrs = { 10, 50, 40, 30 }; 				//初始化整型数组
        Arrays.fill(arrs, 40); 							//替换数组元素
        System.out.println(Arrays.toString(arrs)); 		//将数组arr转换为字符串并输出

        //copay,length) 的作用是：把数组array复制成一个长度为length的新数组
        System.out.println("----copyOf(array,length)方法：----");
        int[] arr11 = { 10, 50, 40, 30 };
        int[] arr22 = Arrays.copyOf(arr11, 3); 			//将arr11复制成长度为3的新数组arr22
        System.out.println(Arrays.toString(arr22));
        int[] arr33 = Arrays.copyOf(arr1, 4); 			//将arr11复制成长度为4的新数组arr33
        System.out.println(Arrays.toString(arr33));
        int[] arr44 = Arrays.copyOf(arr1, 6); 			//将arr11复制成长度为6的新数组arr44
        System.out.println(Arrays.toString(arr44));

        //binarySearch(array, val) 的作用是：查询元素值val在数组array中的下标
        System.out.println("----binarySearch(array, val)方法：----");
        int[] arrss = { 10, 50, 40, 30 };
        Arrays.sort(arrss); 							//先按升序排列
        int index=Arrays.binarySearch(arrss, 30); 		//查找30的下标
        System.out.println(index);
        index=Arrays.binarySearch(arrss, 50); 			//查找50的下标
        System.out.println(index);
    }
}
