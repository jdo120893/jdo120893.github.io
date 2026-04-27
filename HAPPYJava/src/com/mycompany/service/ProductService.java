package com.mycompany.service;


import com.mycompany.model.Product;

import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> products;

    public ProductService(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayAll(){
        for(Product p : products) {
            p.display();
        }
    }
}
