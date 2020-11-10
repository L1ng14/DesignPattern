package com.designPattern.Decorator.Decorate;

import com.designPattern.Decorator.Suit.Suit;

public class T_shit extends Decorate {

    public T_shit(Suit suit) {
        super(suit);
    }


    @Override
    public String getName() {
        return suit.getName()+"   +T恤";
    }

    @Override
    public int price() {
        return suit.price()+199;
    }
}
