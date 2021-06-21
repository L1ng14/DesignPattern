package com.designPattern.Strategy_.postive;


public class RedHeadBird extends Bird  {

    public RedHeadBird() {
        this.flyBehavior = new FlyByWings();
    }

    @Override
    public void display() {
        System.out.println("这是  红头鸟。。。");
    }

    public void doFly(){
        this.flyBehavior.fly();
    }

}
