package com.designPattern.Builder;

public class postive {
    /*=============服务端==========================*/
    interface ComputerBuilder{
        Computer getComputer();
        void setCpu();
        void setGpu();
        void setHd();
        void setRAM();
    }

    static class HighComputerBuilder implements ComputerBuilder {
        private Computer computer = new Computer();

        @Override
        public Computer getComputer() {
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

    static class High_02ComputerBuilder implements ComputerBuilder {
        private Computer computer = new Computer();

        @Override
        public Computer getComputer() {
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
    //指挥者
    static class Director {

        public Computer build(ComputerBuilder builder){
            builder.setCpu();
            builder.setGpu();
            builder.setRAM();
            builder.setHd();
            return builder.getComputer();
        }
    }
    /*==============客户端=====================================*/
    public static void main(String[] args) {
        Director director = new Director();

        Computer computer_01 =director.build(new HighComputerBuilder());
        Computer computer_02 =director.build(new High_02ComputerBuilder());

        System.out.println(computer_01);
        System.out.println(computer_02);
    }
}
