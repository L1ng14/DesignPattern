package com.designPattern.DesignPrincipal.openClose;

public class postive {
    public static void main(String[] args) {
        //输入商品信息，向上转型调用重写方法设置价格
        Pen redPen = new discountPen();
        redPen.setProd_name("英雄牌钢笔");
        redPen.setProd_origin("厂里");
        redPen.setProd_price(15.5f);
        //输出商品信息
        System.out.println(redPen);
    }
}
