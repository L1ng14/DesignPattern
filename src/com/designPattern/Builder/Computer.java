package com.designPattern.Builder;

public class Computer {
        private  String cpu;
        private String gpu;
        private  String Hd;
        private String RAM;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getHd() {
        return Hd;
    }

    public void setHd(String hd) {
        Hd = hd;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", Hd='" + Hd + '\'' +
                ", RAM='" + RAM + '\'' +
                '}';
    }
}
