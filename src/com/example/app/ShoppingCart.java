package com.example.app;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private CdCatalogue cdCatalogue;
    private CourseCatalogue courseCatalogue;
    private CdCatalogue ShoppingCartCd;
    private CourseCatalogue ShoppingCartCourse;

    public ShoppingCart()
    {
        courseCatalogue = new CourseCatalogue();
        courseCatalogue.populateCourseCatalogue();
        cdCatalogue = new CdCatalogue();
        cdCatalogue.populateCdCatologue();

        ShoppingCartCd = new CdCatalogue();
        ShoppingCartCourse = new CourseCatalogue();

    }

    public void addItemCart(String searchVal)
    {
        List<Cd> searchCds =  cdCatalogue.search(searchVal);
        List<Course> searchCourses = courseCatalogue.search(searchVal);

        ShoppingCartCd.createCourse((LinkedList<Cd>) searchCds);
        ShoppingCartCourse.createCourse((LinkedList<Course>) searchCourses);
    }

    public void removeItem(String searchVal)
    {
        if(!(searchVal ==null)) {

           ShoppingCartCourse.deleteCourse(searchVal);
           ShoppingCartCd.deleteCourse(searchVal);

        }
    }

    public double getPrice()
    {
        double price =0;

        price += ShoppingCartCd.getPrice();
        price += ShoppingCartCourse.getPrice();
        return price;
    }

    public void manipulateCart()
    {

        System.out.println("\n\nManipulating the cart");
        courseCatalogue.deleteCourse( "Java");
        cdCatalogue.deleteCourse("Linux");

    }
    void printCart()
    {
        System.out.println("\nCart items: ");
        ShoppingCartCd.printVal();
        ShoppingCartCourse.printVal();
    }
    void printCatalogue()
    {
        System.out.println("\nCatalogue items: ");
        courseCatalogue.printVal();
        cdCatalogue.printVal();
    }

}
