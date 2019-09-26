package com.ecommerce;

public class CourseFree extends Course{

    public CourseFree(String id, String name, String desc) {
        super(id, name, desc);
    }

    public double getPrice()
    {
        return 0.0;
    }
    public double getPrice(int students) {
        return 0.0;
    }
}
