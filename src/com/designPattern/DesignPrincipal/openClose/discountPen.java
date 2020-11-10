package com.designPattern.DesignPrincipal.openClose;

public class discountPen extends Pen{
    //用重写方法设置价格
    @Override
    public void setProd_price(float prod_price) {
        super.setProd_price(prod_price * 0.8f);
    }
}
