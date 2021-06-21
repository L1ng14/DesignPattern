package com.designPattern.Builder;

public class negtive_03 {
    /*=============服务端==========================*/
    interface ComputerBuilder{
        Computer build();
        void setCpu();
        void setGpu();
        void setHd();
        void setRAM();
    }

    static class HighComputerBuilder implements ComputerBuilder{
        private Computer computer = new Computer();

        @Override
        public Computer build() {
            return computer;
        }

        @Override
        public void setCpu() {
            computer.setCpu("9700k");
        }

        @Override
        public void setGpu() {
            computer.setGpu("gtx2080ti");
        }

        @Override
        public void setHd() {
            computer.setHd("SSD--1T");
        }

        @Override
        public void setRAM() {
            computer.setRAM("32G");
        }
    }

    static class High_02ComputerBuilder implements ComputerBuilder{
        private Computer computer = new Computer();

        @Override
        public Computer build() {
            return computer;
        }

        @Override
        public void setCpu() {
            computer.setCpu("9600k");
        }

        @Override
        public void setGpu() {
            computer.setGpu("gtx1080ti");
        }

        @Override
        public void setHd() {
            computer.setHd("SSD--500G");
        }

        @Override
        public void setRAM() {
            computer.setRAM("16G");
        }
    }
    /*==============客户端=====================================*/
    public static void main(String[] args) {
        HighComputerBuilder builder_01 = new HighComputerBuilder();
        builder_01.setCpu();
        builder_01.setGpu();
        builder_01.setHd();
        builder_01.setRAM();
        Computer computer_01 =builder_01.build();

        High_02ComputerBuilder builder_02 = new High_02ComputerBuilder();
        builder_02.setCpu();
        builder_02.setGpu();
        builder_02.setHd();
        builder_02.setRAM();
        Computer computer_02 =builder_02.build();

        System.out.println(computer_01);
        System.out.println(computer_02);
    }
}
