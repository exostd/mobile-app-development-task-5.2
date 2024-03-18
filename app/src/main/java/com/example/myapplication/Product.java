package com.example.myapplication;

public class Product {
    private final String name;
    private final int image;

    public Product(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }


}
