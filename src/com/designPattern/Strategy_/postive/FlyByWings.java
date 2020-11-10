package com.designPattern.Strategy_.postive;

public class FlyByWings implements  FlyBehavior{
    @Override
    public void fly() {
        System.out.println("用翅膀飞~~~~~~~~~~~");
    }
}
