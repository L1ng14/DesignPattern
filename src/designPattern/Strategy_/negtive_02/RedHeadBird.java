package com.designPattern.Strategy_.negtive_02;

public class RedHeadBird extends Bird implements Flyable{
    @Override
    public void display() {
        System.out.println("这是  红头鸟。。。");
    }

    @Override
    public void fly() {
        System.out.println("飞飞飞============");
    }
}
