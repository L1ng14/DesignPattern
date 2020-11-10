package com.designPattern.DesignPrincipal.openClose;

public class negtive {

    public static void main(String[] args) {
        //输入商品信息
        Pen redPen = new Pen();
        redPen.setProd_name("英雄牌钢笔");
        redPen.setProd_origin("厂里");
        redPen.setProd_price(15.5f);
        //输出商品信息
        System.out.println(redPen);
    }
}
