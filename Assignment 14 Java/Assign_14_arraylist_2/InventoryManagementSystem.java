package Assign_14_arraylist_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class InventoryManagementSystem {
    public ArrayList<Product> products=new ArrayList<Product>();

    public void addProduct(String productId, String productName, int quantity, String price) {
        products.add(new Product(productId, productName, quantity, price));
    }

    public void removeProductFromInventory(final String id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(id)) {
                iterator.remove();
            }
        }
    }

    public void displayProducts() {
       Collections.sort(products);   
       System.out.println(products);
        }

    public static void main(String[] args) {
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add a Product");
            System.out.println("2. Remove Product from Inventory");
            System.out.println("3. Display All Products in the Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    String productId = scanner.next();
                    System.out.print("Enter product name: ");
                    String productName = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    String price = scanner.next();
                    inventoryManagementSystem.addProduct(productId, productName, quantity, price);
                    break;
                case 2:
                    System.out.print("Enter product ID to remove: ");
                    String removeById = scanner.next();
                    inventoryManagementSystem.removeProductFromInventory(removeById);
                    break;
                case 3:
                    inventoryManagementSystem.displayProducts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
