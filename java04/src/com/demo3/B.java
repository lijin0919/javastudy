package com.demo3;

public class B extends A{

    public String number = "字符9";

    @Override
    public void test() {
        System.out.println("扩展类方法");
    }

    public static void main(String[] args) {
        A a = new B();
        a.test();
        System.out.println(a.number);
    }
}
