import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortScore {
    public static void main(String[] args) {
        int[] scores=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("请输入5名学员的成绩：");
        //获取学员成绩
        for(int i=0;i<scores.length;i++){
            scores[i]=input.nextInt();
        }
        Arrays.sort(scores);
        System.out.print("学员成绩按升序排列：");
        for(int score:scores){
            System.out.print(score+"\t");
        }

        System.out.print("\n学员成绩按降序排列：");
        for(int i=scores.length-1;i>=0;i--){
            System.out.print(scores[i]+"\t");
        }
    }
}
