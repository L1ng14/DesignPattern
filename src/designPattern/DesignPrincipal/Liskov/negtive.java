package com.designPattern.DesignPrincipal.Liskov;

public class negtive {
    static class Rectangular {
        private Integer width;
        private Integer length;

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getLength() {
            return length;
        }

        public void setLength(Integer length) {
            this.length = length;
        }

    }

    static class Square extends Rectangular {
        private Integer sideWidth;

        @Override
        public Integer getWidth() {
            return sideWidth;
        }

        @Override
        public void setWidth(Integer width) {
            this.sideWidth = width;
        }

        @Override
        public Integer getLength() {
            return sideWidth;
        }

        @Override
        public void setLength(Integer length) {
            this.sideWidth = length;
        }
    }


    static class Utils{
        public static void transform(Rectangular graph){
            while ( graph.getWidth() <= graph.getLength() ){
                graph.setWidth(graph.getWidth() + 1);
                System.out.println("长："+graph.getLength()+" : " +
                        "宽："+graph.getWidth());
            }
        }
    }

    public static void main(String[] args) {
    // Rectangular graph = new Rectangular();
        Rectangular graph = new Square();
        graph.setWidth(20);
       graph.setLength(30);

        Utils.transform(graph);
    }
}
