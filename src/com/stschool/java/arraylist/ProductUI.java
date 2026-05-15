package com.stschool.java.arraylist;

public class ProductUI {

    public Product displayAddProductForm() {
        System.out.println("Product Form");
        String id = InputUtil.getString("Enter Product Id: ");
        String name = InputUtil.getString("Enter Product Name: ");
        double price = InputUtil.getDouble("Enter Product Price: ");

        Product product = new Product(id, name, price);

        return product;
    }

    public int displayProductDisplayForm() {
        System.out.println("1. Display single product");
        System.out.println("2. Display all products");
        int choice = InputUtil.getInt("Enter Your Choice: ");
        return choice;
    }

    public char displayContinueForm() {
        return InputUtil.getChar("Do you want to continue? (Y/N): ");
    }

    public int displayProductMenu() {
        System.out.println("========= Menu ===========");
        System.out.println("1. Add Product");
        System.out.println("2. Delete Product");
        System.out.println("3. Update Product");
        System.out.println("4. Display Product");
        return InputUtil.getInt("Enter Your Choice: ");
    }

}
