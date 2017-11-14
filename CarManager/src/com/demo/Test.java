package com.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎光临");
        System.out.println("1、轿车 \t2、客车");
        System.out.print("请选择你要租赁的汽车类型：");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        switch (choose){
            case 1:
                Car car = new Car();
                car.number = "京A88888";
                System.out.print("请选择你要租赁的汽车品牌：1、别克 2、宝马");
                int choose1 = in.nextInt();
                if (choose1==1){
                    car.brand = "别克";
                    System.out.print("请选择你要租赁的汽车类型：1、林荫大道 2、GL8");
                    int choose2 = in.nextInt();
                    if (choose2 == 1){
                        car.type = "林荫大道";
                    }else {
                        car.type = "GL8";
                    }
                }else {
                    car.brand = "宝马";
                }
                System.out.print("请输入您要租赁的天数：");
                int day = in.nextInt();
                car.money = 60*day;

                System.out.println(car.brand);
                System.out.println(car.money);
                System.out.println(car.number);
                System.out.println(car.type);

                break;
            case 2:
                Bus bus = new Bus();
                bus.number = "京A88888";
                System.out.print("请选择你要租赁的汽车品牌：1、金龙 2、金杯");
                int chooseBrand = in.nextInt();
                if (chooseBrand==1){
                    bus.brand = "金龙";
                }else {
                    bus.brand = "金杯";
                }

                System.out.print("请选择你要租赁的汽车座位数：1、16座 2、34座");
                int chooseSeat = in.nextInt();
                if(chooseSeat == 1){
                    bus.seatNumber = "16座";
                }else {
                    bus.seatNumber = "34座";
                }
                System.out.print("请输入您要租赁的天数：");
                int day1 = in.nextInt();
                bus.money = 60*day1;

                System.out.println(bus.brand);
                System.out.println(bus.money);
                System.out.println(bus.number);
                System.out.println(bus.seatNumber);
                break;


        }


    }
}
