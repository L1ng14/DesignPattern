package com.designPattern.Proxy;

import java.lang.reflect.Proxy;

public class postive {
    public static void main(String[] args) {
        Calculator c = new MyCalculator();

        ClassLoader loader = postive.class.getClassLoader();
        Calculator proxy = (Calculator)Proxy.newProxyInstance(loader, new Class[]{Calculator.class}, new MyHandler(c));

        proxy.add(22,33);
        proxy.sub(55,22);
        proxy.div(10,2);
        proxy.mul(50,5);

    }
}
