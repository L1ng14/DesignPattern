package com.designPattern.DesignPrincipal.openClose;

public class Pen {
    private String prod_name;
    private String prod_origin;
    private float prod_price;

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_origin() {
        return prod_origin;
    }

    public void setProd_origin(String prod_origin) {
        this.prod_origin = prod_origin;
    }

    public float getProd_price() {
        return prod_price;
    }

    public void setProd_price(float prod_price) {
        this.prod_price = prod_price ;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "prod_name='" + prod_name + '\'' +
                ", prod_origin='" + prod_origin + '\'' +
                ", prod_price=" + prod_price +
                '}';
    }
}
