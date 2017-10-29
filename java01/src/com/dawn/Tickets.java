package com.dawn;

import java.util.Scanner;

public class Tickets {

    public void take(){
        Scanner input = new Scanner(System.in);
        int balance = 0;
        while (true){
            System.out.println("请投币：");
            int amount = input.nextInt();

            balance = balance+amount;
            if(balance>=10){
                System.out.println("********************");
                System.out.println("******西成高铁******");
                System.out.println("*******头等舱*******");
                System.out.println("********************");
                System.out.println("找零："+(balance-10)+"元");
                balance = 0;
            }
        }

    }
}
