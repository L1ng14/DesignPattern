package com.designPattern.Decorator.Decorate;

import com.designPattern.Decorator.Suit.Suit;

public class Canvas_Shoes extends Decorate{
    public Canvas_Shoes(Suit suit) {
        super(suit);
    }

    @Override
    public String getName() {
        return suit.getName()+"   +帆布鞋";
    }
    @Override
    public int price() {
        return suit.price()+399;
    }
}