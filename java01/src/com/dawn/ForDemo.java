package com.dawn;

import java.util.Scanner;

public class ForDemo {
    /*
    经常使用的迭代形式
    在第一次迭代之前要初始化
    随后，进行条件测试，
    在每一次迭代结束时，进行某种形式的“进步”
     */

    public static void main(String[] args) {
//        for (初始化表达式; 布尔表达式; 改变循环条件) {
//            语句
//        }



        //练习1
        //打印从0-100的值



        //练习2
        //计算0-100之间所有的偶数和

        //练习3输出加法表
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
