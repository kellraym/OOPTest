package com.raykell;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        System.out.println(price);

        hamburger.addHamburgerAddition1("lettuce", .27);
        hamburger.addHamburgerAddition2("Beans", 9.00);
        price = hamburger.itemizeHamburger();
        System.out.println(price);

    }
}
