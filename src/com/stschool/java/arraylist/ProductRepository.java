package com.stschool.java.arraylist;

import java.util.ArrayList;

public class ProductRepository implements ProductRepositoryInterface{
    ArrayList<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
    }

    @Override
    public Product save(Product product) throws ProductExistsException {

        if(findById(product.getId()) != null) {
            throw new ProductExistsException("Product Already Exists");
        }

        products.add(product);
        return product;
    }

    @Override
    public Product findById(String id) throws ProductNotFoundException {

        Product productById = null;

        for(Product product : products) {
            if(product.getId().equals(id)) {
                productById = product;
            }
        }
        return productById;
    }

    @Override
    public ArrayList<Product> findAll() {
        return products;
    }

    @Override
    public Product update(Product product) throws ProductNotFoundException {

        if(findById(product.getId()) == null) {
            throw new ProductNotFoundException("Product doesn't exist");
        }

        Product productById = findById(product.getId());
        products.remove(productById);

        products.add(product);
        return product;
    }

    @Override
    public boolean delete(Product product) throws ProductNotFoundException {

        if(findById(product.getId()) == null) {
            throw new ProductNotFoundException("Product doesn't exist");
        }

        return products.remove(product);
    }

    @Override
    public boolean deleteById(String id) throws ProductNotFoundException {

        if(findById(id) == null) {
            throw new ProductNotFoundException("Product doesn't exist");
        }

        Product deleteProduct = findById(id);
        return products.remove(deleteProduct);
    }
}
