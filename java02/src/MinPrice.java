import java.util.Scanner;

public class MinPrice {
    public static void main(String[] args) {
        int[] prices = new int[4];
        System.out.println("请输入4家店的价格");
        Scanner input =  new Scanner(System.in);
        for(int i = 0; i < prices.length; i++){
            System.out.print("第" +(i+1)+ "店的价格：");
            prices[i] = input.nextInt();
        }
        //计算最低价
        int min = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
        }
        System.out.println("最低价格是：" + min);
    }
}
