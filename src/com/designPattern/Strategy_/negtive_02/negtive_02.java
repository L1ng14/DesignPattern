package com.designPattern.Strategy_.negtive_02;


public class negtive_02 {
    /*===============客户端========================*/
    public static void main(String[] args) {
        RedHeadBird redHeadBird = new RedHeadBird();
        redHeadBird.display();
        redHeadBird.yell();

        redHeadBird.fly();
    }
}
