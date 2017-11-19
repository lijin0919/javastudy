
import java.util.*;
public class SumTable {
    /**
     * 输入整数，输出其加法表
     */
    public static void main(String[] args){
        int i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个值： ");
        int val = input.nextInt();
        System.out.println("根据这个值可以输出以下加法表： ");
        for(i = 0, j = val; i <= val; i++, j--){
            System.out.println(i + " + " + j + " = " + (i+j));
        }
    }
}
