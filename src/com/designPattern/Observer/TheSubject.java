package com.designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

//被观察者
public abstract class TheSubject {
    //观察者列表
    protected List<Observer> observerList = new ArrayList<>();
    //加入到观察者列表
    public  boolean addObserver(Observer observer){
        return  observerList.add(observer);
    }
    //从观察者列表移除
    public  boolean removeObserver(Observer observer){
        return observerList.remove(observer);
    }
    //变化，并通知观察者
    public abstract void setChange(String Data);
    //为观察者更新内容
    public abstract void upDataObserver(String Data);
}
