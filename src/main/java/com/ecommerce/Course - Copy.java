package com.ecommerce;

abstract class Course {

    abstract double getPrice();
    abstract double getPrice(int students);

    String id = "";
    String name = "";
    String desc = "";

    public Course() {
    }

    protected Course(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "ID: " + this.id + " " + "Name: "+ this.name +" " + "Description: " + this.desc;
    }
}
