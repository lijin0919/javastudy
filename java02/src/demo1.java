import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {

        System.out.println("请输入数字");
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[100];
        double sum = 0;
        int count = 0;
        int x = in.nextInt();

        while (x !=-1){
            numbers[count] = x;
            sum += x;
            count++;
            x = in.nextInt();
        }
        if (count>0){
            double average = sum/count;
            for (int i = 0; i < count; i++) {
                if (numbers[i]>average){
                    System.out.println(numbers[i]);
                }
            }
        }
        System.out.println(sum/count);
    }

    //安全隐患？
}
