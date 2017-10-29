package com.dawn;

public class DoWhileDemo {
    public static void main(String[] args) {

        /*
        do-while中的语句至少会执行一次，即使表达式被计算为false
        在实际应用中，while比较常用
         */

//        do {
//            语句；
//        } while (布尔表达式);
//


        //示例1,
        //比较while和do-while
        int a = 100;
        while (a == 10) {
            System.out.println("while");
        }

        do {
            System.out.println("do-while");
        } while (a == 10);
    }
}
