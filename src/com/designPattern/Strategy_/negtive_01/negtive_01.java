package com.designPattern.Strategy_.negtive_01;

public class negtive_01 {
/*===============客户端========================*/
    public static void main(String[] args) {
        RedHeadBird redHeadBird = new RedHeadBird();
        redHeadBird.display();
        redHeadBird.yell();

        System.out.println("     ");

        RubberBird rubberBird = new RubberBird();
        rubberBird.display();
        rubberBird.yell();
    }
}
