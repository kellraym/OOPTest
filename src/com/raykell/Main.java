package com.raykell;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        System.out.println(price);

        hamburger.addHamburgerAddition1("lettuce", .27);
        hamburger.addHamburgerAddition2("Beans", 9.00);
        price = hamburger.itemizeHamburger();
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        price = healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("Healthy Beans", 12.00);
        healthyBurger.itemizeHamburger();

    }
}
