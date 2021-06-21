package com.designPattern.Decorator;

import com.designPattern.Decorator.Decorate.Canvas_Shoes;
import com.designPattern.Decorator.Decorate.Skirt;
import com.designPattern.Decorator.Suit.Suit_02;

/*=================客户端====================*/
public class postive {
    public static void main(String[] args) {
        Suit_02 girl_suit = new Suit_02();
        Skirt suitAddSkirt = new Skirt(girl_suit);
        Canvas_Shoes suitAddCanvas_shoes = new Canvas_Shoes(suitAddSkirt);

        System.out.println(suitAddCanvas_shoes);
    }
}
