package com.designPattern.Strategy_.postive;

public class FlyByKick implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("被踢飞了！！！！！！");
    }
}
