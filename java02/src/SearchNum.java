public class SearchNum {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};  //定义有序数组
        int searchNum = 2; //定义要查找的数
        int startIndex = 0;  //定义开始下标
        int endIndex = arr.length-1;  //定义结束下标
        int midIndex = -1; //定义中间位置下标
        boolean isFind = false;  //标记是否找到
        do{
            midIndex = (startIndex+endIndex)/2;   //获取中间位置下标
            if(arr[midIndex] == searchNum){ //如果中间位置元素值与要查找的值相等，则找到啦
                System.out.println("恭喜你，找到啦，下标为"+midIndex);
                isFind = true;
                break;
            }else if(arr[midIndex]>searchNum){ //如果比要找到的数大，则将结束下标更新为midIndex-1
                endIndex = midIndex-1;
            }else{
                startIndex = midIndex+1; ///如果比要找到的数小，则将开始下标更新为midIndex+1
            }
        }while(startIndex<=endIndex);

        if(!isFind){
            System.out.println("抱歉，要查找的数不在此数列中");
        }
    }
}
