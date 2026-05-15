package com.stschool.java.arraylist;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        ProductUI productUI = new ProductUI();

        char continueInput = 'Y';
        do {
            int choice = productUI.displayProductMenu();

            switch (choice) {
                case 1: try {
                    Product product = productUI.displayAddProductForm();
                    productRepository.save(product);
                    System.out.println("Product saved Successfully");
                } catch (ProductExistsException e) {
                    System.out.println(e.getMessage());
                }
                break;

                case 2: try {
                    String id = InputUtil.getString("Enter Product Id to Delete: ");
                    if(productRepository.deleteById(id)) {
                        System.out.println("Product deleted successfully");
                    } else {
                        System.out.println("Failed to delete product");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

                case 3: try {
                    Product product = productUI.displayAddProductForm();
                    productRepository.update(product);
                    System.out.println("product updated successfully");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

                case 4:
                    int displayOption = productUI.displayProductDisplayForm();

                    switch (displayOption) {
                        case 1: try {
                                Product displayProduct = productUI.displayAddProductForm();
                                productRepository.displayProduct(displayProduct);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        case 2: productRepository.displayAllProducts();
                        break;

                        default:
                            System.out.println("Enter valid option");
                    }
                break;

                default:
                    System.out.println("Enter valid option");
            }

            continueInput = productUI.displayContinueForm();

        } while (continueInput == 'Y');

        System.out.println("Successfully Completed Execution");
    }
}
