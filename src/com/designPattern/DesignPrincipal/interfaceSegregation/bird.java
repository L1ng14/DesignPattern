package com.designPattern.DesignPrincipal.interfaceSegregation;

class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("用嘴巴吃");
    }

    @Override
    public void fiy() {
        System.out.println("用翅膀飞");
    }

    @Override
    public void swim() {
    //我是大雕不会游泳
    }
}
