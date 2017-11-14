package com.demo1;

public class F35 extends F22{

    @Override
    public void attack() {
        super.attack();
        System.out.println("战斧式：2枚");
    }

    public void move(){
        System.out.println("垂直起降");
    }

    public static void main(String[] args) {
        F35 f35 = new F35();
        f35.attack();
    }
}
