package com.designPattern.Builder;

public class negtive_02 {
    /*=============服务端==========================*/
    static class HighComputerBuilder {
        private Computer computer = new Computer();

        public Computer build() {
            computer.setCpu("9700k");
            computer.setGpu("gtx2080ti");
            computer.setHd("SSD--1T");
            computer.setRAM("32G");
            return computer;
        }
    }

    static class High_02ComputerBuilder {
        private Computer computer = new Computer();

        public Computer build() {
            computer.setCpu("9600k");
            computer.setGpu("gtx1080ti");
            computer.setHd("SSD--500G");
            computer.setRAM("16G");
            return computer;
        }
    }
/*==============客户端=====================================*/
    public static void main(String[] args) {
        HighComputerBuilder builder_01 = new HighComputerBuilder();
        Computer computer_01 =builder_01.build();

        High_02ComputerBuilder builder_02 = new High_02ComputerBuilder();
        Computer computer_02 =builder_02.build();

        System.out.println(computer_01);
        System.out.println(computer_02);
    }
}
