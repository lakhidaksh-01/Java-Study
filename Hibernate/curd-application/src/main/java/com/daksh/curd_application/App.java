package com.daksh.curd_application;

import java.time.LocalDate;
import java.util.Scanner;

import com.daksh.curd_application.entities.Customer;
import com.daksh.curd_application.entities.Product;
import com.daksh.curd_application.ShopService;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== E-Commerce Menu =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Product");
            System.out.println("3. View Products");
            System.out.println("4. Update Product Stock");
            System.out.println("5. Place Order");
            System.out.println("6. View Customer Orders");
            System.out.println("7. View Product Buyers");
            System.out.println("8. Delete Customer");
            System.out.println("9. Delete Product");
            System.out.println("10. Exit");

            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1: {
                    Customer customer = new Customer();

                    System.out.print("Enter customer name: ");
                    customer.setName(sc.nextLine());

                    System.out.print("Enter customer email: ");
                    customer.setEmail(sc.nextLine());

                    System.out.print("Enter customer phone: ");
                    customer.setPhone(sc.nextLine());

                    ShopService.addCustomer(customer);
                    break;
                }

                case 2: {
                    Product product = new Product();

                    System.out.print("Enter product name: ");
                    product.setName(sc.nextLine());

                    System.out.print("Enter product price: ");
                    product.setPrice(sc.nextDouble());

                    System.out.print("Enter stock quantity: ");
                    product.setStockQuantity(sc.nextInt());
                    sc.nextLine();

                    ShopService.addProduct(product);
                    break;
                }

                case 3: {
                    ShopService.viewAllProducts();
                    break;
                }

                case 4: {
                    System.out.print("Enter product id: ");
                    int productId = sc.nextInt();

                    System.out.print("Enter new stock quantity: ");
                    int stock = sc.nextInt();
                    sc.nextLine();

                    ShopService.updateProductStock(productId, stock);
                    break;
                }

                case 5: {
                    System.out.print("Enter customer id: ");
                    int customerId = sc.nextInt();

                    System.out.print("Enter product id: ");
                    int productId = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    LocalDate orderDate = LocalDate.now();

                    ShopService.placeOrder(customerId, productId, quantity, orderDate);
                    break;
                }

                case 6: {
                    System.out.print("Enter customer id: ");
                    int customerId = sc.nextInt();
                    sc.nextLine();

                    ShopService.viewCustomerOrders(customerId);
                    break;
                }

                case 7: {
                    System.out.print("Enter product id: ");
                    int productId = sc.nextInt();
                    sc.nextLine();

                    ShopService.viewProductBuyers(productId);
                    break;
                }

                case 8: {
                    System.out.print("Enter customer id to delete: ");
                    int customerId = sc.nextInt();
                    sc.nextLine();

                    ShopService.deleteCustomer(customerId);
                    break;
                }

                case 9: {
                    System.out.print("Enter product id to delete: ");
                    int productId = sc.nextInt();
                    sc.nextLine();

                    ShopService.deleteProduct(productId);
                    break;
                }

                case 10: {
                    System.out.println("Exiting application...");
                    sc.close();
                    return;
                }

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}