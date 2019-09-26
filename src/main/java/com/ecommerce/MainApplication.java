package com.ecommerce;

public class MainApplication {

    public static void main(String args[])
    {

        ShoppingCart cart = new ShoppingCart();
        cart.printVal();
        System.out.println("Total cost is: " + cart.getPrice());


        cart.manipulateCart();
        cart.printVal();
        System.out.println("Total cost is: " + cart.getPrice());
    }
}
