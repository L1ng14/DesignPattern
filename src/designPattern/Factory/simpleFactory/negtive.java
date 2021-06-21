package com.designPattern.Factory.simpleFactory;

public class negtive {
/*===============服务端======================*/
    interface Food{
        void eat();
    }

    static class Noodles implements Food{
        @Override
        public void eat() {
            System.out.println("吃面条。。。。。");
        }
    }

/*=================客户端===================*/
    public static void main(String[] args) {
        Food food01 = new Noodles();
        food01.eat();
    }
}
