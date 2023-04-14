package org.example;

public class Product extends Category{
    private String name;
    private Integer price;
    private Double rating;

    public Product(String category, String name, Integer price, Double rating) {
        super(category);
        this.name = name;
        this.price = price;
        this.rating = rating;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(String size) {
        this.rating = rating;
    }

    private void productPrint(){
        System.out.printf("%s, Price: %d, Rating: %f", name, price, rating);
        this.categoryPrint();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", category='" + category + '\'' +
                '}';
    }
}
