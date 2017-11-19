/*
 * 打印9*9乘法表
 */
public class Multiplication {

    public static void main(String[] args) {
        int i, j;  // 循环变量
        for (i = 1; i <= 9; i++){  // 外层循环控制被乘数
            for (j = 1; j <= i; j++){  // 内层循环控制乘数
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();  // 打印一行后换行
        }
    }
}
