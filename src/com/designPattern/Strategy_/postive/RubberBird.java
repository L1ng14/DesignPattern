package com.designPattern.Strategy_.postive;

public class RubberBird extends Bird {

    public RubberBird() {
        this.flyBehavior = new FlyByKick();
    }

    @Override
    public void display() {
        System.out.println("这是橡皮鸟-----------");
    }

    public void doFly(){
        this.flyBehavior.fly();
    }
}
