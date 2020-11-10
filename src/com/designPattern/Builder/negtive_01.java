package com.designPattern.Builder;

public class negtive_01 {

    public static void main(String[] args) {
        Computer computer_01 = new Computer();
        computer_01.setCpu("9700k");
        computer_01.setGpu("gtx2080ti");
        computer_01.setHd("SSD--1T");
        computer_01.setRAM("32G");

        Computer computer_02 = new Computer();
        computer_02.setCpu("9600k");
        computer_02.setGpu("gtx1080ti");
        computer_02.setHd("SSD--500G");
        computer_02.setRAM("16G");

        System.out.println(computer_02);
        System.out.println(computer_01);
    }
}
