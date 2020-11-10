package com.designPattern.DesignPrincipal.demeter;

public class postive {


    class Computer{
        public  void  closeFile(){
            System.out.println("关闭文件");
        }
        public  void  closeScreen(){
            System.out.println("关闭屏幕");
        }
        public  void  powerOff(){
            System.out.println("断电");
        }

        public void turnOff(){  //封装细节
            this.closeFile();
            this.closeScreen();
            this.powerOff();
        }
    }

    class Person{
        private Computer computer;

        public void offComputer(){
            computer.turnOff();
        }
    }
}
