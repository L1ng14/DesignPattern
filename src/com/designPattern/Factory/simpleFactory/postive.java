package com.designPattern.Factory.simpleFactory;

public class postive {

    /*===============服务端======================*/
    interface Food{
        void eat();
    }

    static class Spaghetti implements Food {
        @Override
        public void eat() {
            System.out.println("吃西餐面条。。。。。");
        }
    }

    static class FoodFactory {
        public Food getFood(int num){
            Food food =null;
            switch (num){
                case 1 :
                    food = new Spaghetti();
            }
            return food;
        }
    }

    /*=================客户端===================*/
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        Food food01 = foodFactory.getFood(1);
        food01.eat();
    }
}
