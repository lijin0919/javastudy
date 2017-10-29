package com.dawn;

public class ContinueDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

        //循环录入Java课的学生成绩，统计分数大于等于80分的学生人数
    }
}
