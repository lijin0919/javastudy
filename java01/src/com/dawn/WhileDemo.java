package com.dawn;

public class WhileDemo {

    public static void main(String[] args) {

        /*
        在循环开始时，会计算一次布尔表达式的值；
        在语句的下一次迭代开始前会再计算一次
         */

//        while (布尔表达式) {
//            语句；
//        }

        //示例1
        //产生一个随机数，直到符合条件
        //Math.random()产生0-1，不包括1的double类型
        while (Math.random() < 0.99) {
            System.out.println("产生了随机数");
        }

        //输入任意数字，打印输出是几位数
    }
}
