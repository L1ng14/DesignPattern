package com.designPattern.Proxy;

public class MyCalculator implements Calculator{

   @Override
   public int add(int a, int b) {
       return a + b;
   }

   @Override
   public int sub(int a, int b) {
       return a - b;
   }

   @Override
   public int mul(int a, int b) {
       return a * b;
   }

   @Override
   public int div(int a, int b) {
       return a / b;
   }
}
