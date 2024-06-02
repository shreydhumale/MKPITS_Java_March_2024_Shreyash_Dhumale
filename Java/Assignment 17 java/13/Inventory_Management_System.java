package assignment_17;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory_Management_System{
    private static LinkedHashMap<String, Integer> inventory = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nInventory Management System:");
            System.out.println("1. Add/Update item");
            System.out.println("2. Delete item");
            System.out.println("3. Retrieve item");
            System.out.println("4. Display inventory");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addOrUpdateItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    retrieveItem();
                    break;
                case 4:
                    displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addOrUpdateItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); 
        
        inventory.put(itemName, quantity);
        System.out.println("Item added/updated successfully.");
    }

    private static void deleteItem() {
        System.out.print("Enter item name to delete: ");
        String itemName = scanner.nextLine();
        if (inventory.remove(itemName) != null) {
            System.out.println("Item deleted successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void retrieveItem() {
        System.out.print("Enter item name to retrieve: ");
        String itemName = scanner.nextLine();
        Integer quantity = inventory.get(itemName);
        if (quantity != null) {
            System.out.println("Item: " + itemName + ", Quantity: " + quantity);
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void displayInventory() {
        System.out.println("Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
