package com.designPattern.Decorator.Decorate;

import com.designPattern.Decorator.Suit.Suit;

public abstract class Decorate extends Suit{
    protected Suit suit;

    public Decorate(Suit suit){
        super(suit.getName());
        this.suit = suit;
    }
}
