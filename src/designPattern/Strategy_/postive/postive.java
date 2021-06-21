package com.designPattern.Strategy_.postive;


public class postive {
    /*===============客户端========================*/
    public static void main(String[] args) {
        RedHeadBird redHeadBird = new RedHeadBird();
        redHeadBird.display();
        redHeadBird.yell();
        redHeadBird.doFly();

        System.out.println("         ");
        System.out.println("靠近人群中.......");

        redHeadBird.setFlyBehavior(new FlyByKick());
        redHeadBird.doFly();
    }
}
