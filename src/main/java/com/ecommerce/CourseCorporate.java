package com.ecommerce;

public class CourseCorporate extends Course {


    private double price= 0.0;
    private int students =0;

    public CourseCorporate(String id, String name, String desc, double price, int students) {
        super(id, name, desc);
        this.price = price;
        this.students = students;
    }

    public double getPrice() {
        if (students<5)
            return 999999999.99;
        else if(students<20)
            return (0.9 * this.price * students);
        else if(students<50)
            return (0.8 * this.price * students);
        else
            return (0.5 * this.price * students);
    }
    public double getPrice(int students) {

        if (students<5)
            return 999999999.99;
        else if(students<20)
            return (0.9 * this.price * students);
        else if(students<50)
            return (0.8 * this.price * students);
        else
            return (0.5 * this.price * students);

    }

    public void setPrice(double price) {
        this.price = price;
    }
}

