package com.ecommerce;

public class CdPaid extends Cd{

    private double price = 0.0;

    public CdPaid(String name, String desc, double price) {
        super(name, desc);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public double getPrice(int students) {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

