package com.ecommerce;

import java.util.List;

public class ShoppingCart {

    private CdCatalogue cdCatalogue;
    private CourseCatalogue courseCatalogue;

    public ShoppingCart()
    {
        courseCatalogue = new CourseCatalogue();
        courseCatalogue.populateCourseCatologue();

        cdCatalogue = new CdCatalogue();
        cdCatalogue.populateCdCatologue();

    }

    public double getPrice()
    {
        double price;
        price = courseCatalogue.getPrice() + cdCatalogue.getPrice();
        return price;

    }

    public void manipulateCart()
    {

        System.out.println("\n\nManipulating the cart");
        courseCatalogue.deleteCourse( "Java");
        cdCatalogue.deleteCourse("Linux");

    }
    void printVal()
    {
        courseCatalogue.printVal();
        cdCatalogue.printVal();
    }

}
