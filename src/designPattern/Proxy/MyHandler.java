package com.designPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyHandler implements InvocationHandler {
    private Calculator calculator ;
    public MyHandler(Calculator c){
        this.calculator = c;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用"+method.getName()+",  参数是"+ Arrays.toString(args));
        int res = (int) method.invoke(calculator, args);
        System.out.println("结果是 "+res);
        return res;
    }
}
