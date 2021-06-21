package com.designPattern.Strategy_.postive;

public abstract  class Bird {

    protected FlyBehavior flyBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();

    public void yell() {
        System.out.println("吱吱吱.....");
    }
}
