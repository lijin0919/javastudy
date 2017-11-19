/*
 * 打印矩形
 * */
public class PrintRect {
	public static void main(String[] args) {
		//外层循环，执行五次，每次输出一行*
		for (int i = 1; i <= 5; i++) {
			//内层循环，执行五次，每次输出一个*
			for (int j = 1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
