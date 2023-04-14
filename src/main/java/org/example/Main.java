package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product fakeProd = new Product("", "", 0, 0.0);
        Product product1 = new Product("Cleaning", "Window cleaner", 290, 4.0);
        Product product2 = new Product("Cleaning", "Sponge set", 100, 3.5);
        Product product3 = new Product("Food", "Pasta", 30, 4.3);
        Product product4 = new Product("Drinks", "Cola", 30, 4.0);
        Basket basket1 = new Basket(fakeProd);
        User user1 = new User("Sereja", "123", basket1);
        Basket basket2 = new Basket(fakeProd);
        User user2 = new User("Anna", "re4", basket2);
        Basket basket3 = new Basket(fakeProd);
        User user3 = new User("Sasha", "foo", basket3);
        Set<Product> store = basket1.generateStore(product1, product2, product3, product4);
        basket1.basketAdd(product1, store, user1);
        basket2.basketAdd(product3, store, user2);
        basket3.basketAdd(product2, store, user3);
    }
}