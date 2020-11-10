package com.designPattern.Decorator.Suit;

public abstract class Suit {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Suit(String name){
        this.name =name;
    }

    public abstract int price();

    @Override
    public String toString() {
        return "Suit{" +
                "name='" + this.getName() + '\'' +  //注意这里使用this.getName()
                "price='" + price() + '\'' +
                '}';
    }
}
