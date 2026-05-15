package com.stschool.java.arraylist;

import java.util.ArrayList;

public interface ProductRepositoryInterface {
    Product save(Product product) throws ProductExistsException;
    Product findById(String id) throws ProductNotFoundException;
    ArrayList<Product> findAll();
    Product update(Product product) throws ProductNotFoundException;
    boolean delete(Product product) throws ProductNotFoundException;
    boolean deleteById(String id) throws ProductNotFoundException;
    void displayProduct(Product product) throws ProductNotFoundException;
    void displayAllProducts();
}
