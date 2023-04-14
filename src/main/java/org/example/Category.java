package org.example;

public class Category {
    protected String category;

    public Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    protected void categoryPrint() {
        System.out.printf("Category: %s", category);
    }
}
