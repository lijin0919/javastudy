import java.util.Scanner;

public class DoWhileDemo {

	/*
	 * 如何使用do-while循环
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";		//标识是否合格
		do{
			System.out.println("上机编写程序！");
			System.out.print("合格了吗?(y/n)");
			answer = input.next();
			System.out.println("");
		}while(!"y".equals(answer));
		System.out.println("恭喜你通过了测试！");
	}
}