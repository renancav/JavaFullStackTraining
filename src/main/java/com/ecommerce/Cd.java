package com.ecommerce;

abstract class Cd {

    abstract double getPrice();
    abstract double getPrice(int students);

    String name = "";
    String desc = "";

    public Cd() {
    }

    protected Cd(String name, String desc) {

        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String toString()
    {
        return "Name: "+ this.name +" " + "Description: " + this.desc;
    }
}
