package com.dawn;

public class NestDeom {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i的值为：" + i + "\t" + "j的值为：" + j);
            }
        }

        //打印矩形

        //打印平行四边形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //打印等腰三角形

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //打印菱形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (5 - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //1,打印99乘法口诀
        int i, j;  // 循环变量
        for (i = 1; i <= 9; i++) {  // 外层循环控制被乘数
            for (j = 1; j <= i; j++) {  // 内层循环控制乘数
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();  // 打印一行后换行
        }
    }
}
