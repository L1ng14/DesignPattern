package com.designPattern.DesignPrincipal.interfaceSegregation;

public class Bird_02 implements Fly,Eat{
    @Override
    public void eat() {
        System.out.println("用嘴巴吃");
    }

    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }

    //我是大雕不会游泳
}
