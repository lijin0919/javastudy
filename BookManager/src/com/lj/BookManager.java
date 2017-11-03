package com.lj;

import java.util.Scanner;

public class BookManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //书名数组
        String[] bookNames = new String[5];
        bookNames[0] = "三国";
        bookNames[1] = "西游";
        bookNames[2] = "水浒";

        //借出状态数组
        String[] bookState = new String[5];
        bookState[0] = "借出";
        bookState[1] = "未借";
        bookState[2] = "未借";

        //天数数组
        int[] bookDay = new int[5];
        bookDay[0] = 1;
        bookDay[1] = 0;
        bookDay[2] = 0;

        while (true){
            //输出欢迎菜单
            System.out.println("欢迎使用迷你图书管理器");
            System.out.println("-------------------------");
            System.out.println("1.新增图书");
            System.out.println("2.查看图书");
            System.out.println("3.删除图书");
            System.out.println("4.借出图书");
            System.out.println("5.归还图书");
            System.out.println("6.退出图书");
            System.out.println("-------------------------");
            System.out.println("请选择：");
            int no = in.nextInt();

            switch (no){
                case 1:
                    //新增图书
                    System.out.println("-->新增图书\n");
                    System.out.println("请输入图书名称：");
                    String name = in.next();//输入的书名
                    //将name添加到书名数组中
                    for (int i = 0; i < bookNames.length; i++) {
                        if (bookNames[i]==null){
                            bookNames[i] = name;
                            break;
                        }
                    }
                    break;
                case 2://查看
                    System.out.println("-->查看图书\n");
                    System.out.println("序号\t名称\t状态\t借出日期\t借出次数");
                    //遍历书名数组
                    for (int i = 0; i < bookNames.length ; i++) {
                        if (bookNames[i]!=null){//如果数组当前i位不是null
                            System.out.println(i+"\t\t"+bookNames[i]+"\t"+bookState[i]+"\t"+bookDay[i]);//输出
                        }

                    }
                    break;
                case 3:
                    //删除操作
                    System.out.println("-->查看图书\n");
                    System.out.println("序号\t名称\t状态\t借出日期\t借出次数");
                    //遍历书名数组
                    for (int i = 0; i < bookNames.length ; i++) {
                        if (bookNames[i]!=null){//如果数组当前i位不是null
                            System.out.println(i+"\t\t"+bookNames[i]);//输出
                        }

                    }

                    System.out.println("请输入要删除的图书序号：");
                    int a = in.nextInt();//输入的序号
                    for (int i = a; i < bookNames.length; i++) {
                        bookNames[i] = null;
                        //从删除位置的后一本书开始先前递增
                        //i最后会成为数组长度-1的值，那么，i+1
                        //就会超越数组下表
                        if (i!=(bookNames.length-1)){
                            bookNames[i] =  bookNames[i+1];
                        }

                    }

                    break;
                case 4:
                    //借书
                    System.out.println("-->查看图书\n");
                    System.out.println("序号\t名称\t状态\t借出日期\t借出次数");
                    //遍历书名数组
                    for (int i = 0; i < bookNames.length ; i++) {
                        if (bookNames[i]!=null){//如果数组当前i位不是null
                            System.out.println(i+"\t\t"+bookNames[i]+"\t"+bookState[i]+"\t"+bookDay[i]);//输出
                        }

                    }
                    System.out.println("请选择你要借阅的图书序号");
                    int b = in.nextInt();//输入的图书序号

                    if (bookState[b].equals("借出")){//比较字符串
                        System.out.println("此书已借出");
                    }else {
                        bookState[b] = "借出";
                        System.out.println("请输入借出天数");
                        int day = in.nextInt();
                        bookDay[b] = day;
                    }



                    break;
                case 5:
                    //归还
                    System.out.println("-->查看图书\n");
                    System.out.println("序号\t名称\t状态\t借出日期\t借出次数");
                    //遍历书名数组
                    for (int i = 0; i < bookNames.length ; i++) {
                        if (bookNames[i]!=null&&bookState[i].equals("借出")){//如果数组当前i位不是null
                            System.out.println(i+"\t\t"+bookNames[i]+"\t"+bookState[i]+"\t"+bookDay[i]);//输出
                        }

                    }
                    System.out.println("请选择你要归还的图书序号");
                    int c = in.nextInt();
                    bookState[c] = "未借";
                    break;
                case 6:
                    //退出
                    System.out.println("系统已经退出");
                    System.exit(0);

                    break;
                default:
                    break;
            }
        }

    }
}
