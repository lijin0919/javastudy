import java.util.Scanner;

/**
 * 求数组最大值
 */
public class MaxScore {

    public static void main(String[] args) {
        int[] scores = new int[5];
        int max = 0;	//记录最大值
        System.out.println("请输入5位学员的成绩：");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();
        }
        //计算最大值
        //使用max存储擂主初始值：第一个元素为擂主
        max = scores[0];
        //循环打擂
        for(int i = 1; i < scores.length; i++){
            if(scores[i] > max){
                max = scores[i];
            }
        }
        System.out.println("考试成绩最高分为：" + max);
    }
}
