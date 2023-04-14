package org.example;

import java.util.HashSet;
import java.util.Set;

public class Basket {
    protected Set<Product> basket;

    public Set<Product> getBasket() {
        return basket;
    }

    public void setBasket(Set<Product> basket) {
        this.basket = basket;
    }

    public Basket(Product prod) {
        Set<Product> basket = new HashSet<>();
        basket.add(prod);
        this.basket = basket;
    }

    public Basket(){}

    /**
     * Добавляет продукт в корзину и удаляет из магазина
     */
    public void basketAdd(Product product, Set<Product> store, User user){
        basket.add(product);
        storeDelete(store, product);
        System.out.println();
        basketPrint(user);
        System.out.println();
        storePrint(store);
    }

    private void storeDelete(Set<Product> store, Product product) {
        if (store.contains(product))
            store.remove(product);
    }

    /**
     * @param basket -- Вывод корзины
     */
    public void basketPrint(User user) {
        System.out.printf("%s's basket: ", user.login);
       for (Product product: basket)
           if (!product.category.isBlank())
               System.out.println(product);
    }

    /**
     * @return Изначальное содержание магазина
     */
    public Set<Product> generateStore(Product product1, Product product2, Product product3, Product product4){
                Set<Product> store = new HashSet<>() {{
            add(product1);
            add(product2);
            add(product3);
            add(product4);
        }};
                storePrint(store);
        return store;
    }

    public void storePrint(Set<Product> store){
        System.out.println("Store's products:");
        for (Product pr: store){
            System.out.println(pr);}
    }
}
