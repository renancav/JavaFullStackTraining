package com.ecommerce;

public class CoursePaid extends Course{

    private double price = 0.0;

    public CoursePaid(String id, String name, String desc, double price) {
        super(id, name, desc);
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
