package com.designPattern.Proxy;

/*===================客户端=============*/
public class negtive {
        public static void main(String[] args) {
           Calculator c = new MyCalculator();
           System.out.println(c.add(2, 3));
           System.out.println(c.sub(10, 3));
           System.out.println(c.mul(8, 3));
           System.out.println(c.div(99, 3));
    }
}
