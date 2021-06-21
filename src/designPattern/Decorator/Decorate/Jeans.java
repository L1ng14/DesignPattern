package com.designPattern.Decorator.Decorate;

import com.designPattern.Decorator.Suit.Suit;

public class Jeans extends Decorate{

    public Jeans(Suit suit) {
        super(suit);
    }

    @Override
    public String getName() {
        return suit.getName()+"   +牛仔裤";
    }
    @Override
    public int price() {
        return suit.price()+399;
    }
}