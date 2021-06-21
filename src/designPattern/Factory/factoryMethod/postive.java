package com.designPattern.Factory.factoryMethod;

public class postive {
    /*===============服务端======================*/
    //-----------------------产品--------------------
    interface Food{
        void eat();
    }

    static class Spaghetti implements Food {
        @Override
        public void eat() {
            System.out.println("吃西餐面条。。。。。");
        }
    }


    //新增产品
    static class Rice implements Food {
        @Override
        public void eat() {
            System.out.println("吃米饭。。。。。");
        }
    }

    //--------------------------工厂-----------------------
     interface FoodFactory {
         Food getFood();
    }

    static class SpaghettiFactory implements FoodFactory{

        @Override
        public Food getFood() {
            return new Spaghetti();
        }
    }

    //新增产品工厂
    static class RiceFactory implements FoodFactory{

        @Override
        public Food getFood() {
            return new Rice();
        }
    }

    //------------------------产品质检流程-----------------------、

    static class QualityInspection {

        public void checking(FoodFactory foodFactory){
            System.out.println("我是人肉质检员。。。。。准备开吃 -_- ");
            Food food = foodFactory.getFood();
            food.eat();
        }
    }

    /*=================客户端===================*/
    public static void main(String[] args) {
        FoodFactory foodFactory01 = new  SpaghettiFactory();
        FoodFactory foodFactory02 = new  RiceFactory();
//         Food food01 = foodFactory.getFood();
//        food01.eat();

        QualityInspection inspection = new QualityInspection();
        inspection.checking(foodFactory02);
        inspection.checking(foodFactory01);
    }
}
