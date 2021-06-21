package com.designPattern.Observer;

public class Reader implements Observer{
    private String name ;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(String Data) {
        System.out.println(this.name+"收到报纸，阅读最新报道:"+Data);
    }

    @Override
    public void disObservered(TheSubject subject) {
        subject.removeObserver(this);
    }

    @Override
    public void doObservered(TheSubject subject) {
        subject.addObserver(this);
    }
}
