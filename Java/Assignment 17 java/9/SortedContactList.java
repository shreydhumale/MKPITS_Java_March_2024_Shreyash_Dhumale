package assignment_17;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class  SortedContactList{
    public static void main(String[] args) {
         TreeMap<String, String> contactList = new TreeMap<>();
         Scanner scanner = new Scanner(System.in);

         while (true) {
             System.out.println("\nSorted Contact List Management:");
             System.out.println("1. Add/Update contact");
             System.out.println("2. Delete contact");
             System.out.println("3. Retrieve contact");
             System.out.println("4. Display all contacts");
             System.out.println("5. Exit");
             System.out.print("Choose an option: ");
             
             int option = scanner.nextInt();
             scanner.nextLine();

             switch (option) {
                 case 1: 
                     System.out.print("Enter contact name: ");
                     String name = scanner.nextLine();
                     System.out.print("Enter phone number: ");
                     String phoneNumber = scanner.nextLine();
                     contactList.put(name, phoneNumber);
                     System.out.println("Contact added/updated successfully.");
                     break;

                 case 2:
                     System.out.print("Enter contact name to delete: ");
                     String deleteName = scanner.nextLine();
                     if (contactList.remove(deleteName) != null) {
                         System.out.println("Contact deleted successfully.");
                     } else {
                         System.out.println("Contact not found.");
                     }
                     break;

                 case 3: 
                     System.out.print("Enter contact name to retrieve: ");
                     String retrieveName = scanner.nextLine();
                     String retrievedNumber = contactList.get(retrieveName);
                     if (retrievedNumber != null) {
                         System.out.println(retrieveName + ":" + retrievedNumber);
                     } else {
                         System.out.println("Contact not found.");
                     }
                     break;

                 case 4:
                     System.out.println("Contact list in alphabetical order:");
                     for (Map.Entry<String, String> entry : contactList.entrySet()) {
                         System.out.println(entry.getKey() + ": " + entry.getValue());
                     }
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
 }
