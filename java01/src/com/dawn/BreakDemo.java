package com.dawn;

public class BreakDemo {

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            if (i == 3) {
//                break;
//            }
//
//            System.out.println(i);
//        }

        a:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i="+i+"\t"+"j="+j);
                if (j==3){
                    break a;
                }
            }
        }

        //1,循环输入5门成绩并计算平均分，如果输入负数，则退出
        //2,1~10之间的整数相加，得到累加值大于20的当前数

    }
}
