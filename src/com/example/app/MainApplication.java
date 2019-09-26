package com.example.app;

public class MainApplication {

    public static void main(String args[])
    {

        ShoppingCart cart = new ShoppingCart();

        cart.printCatalogue();
        cart.printCart();

        cart.addItemCart("Java");
        cart.printCart();
        System.out.println(cart.getPrice());

        cart.removeItem("Java");
        cart.printCart();
        System.out.println(cart.getPrice());

        cart.addItemCart("Java");
        cart.addItemCart("Windows 10");

        cart.printCart();
        System.out.println(cart.getPrice());
    }
}
