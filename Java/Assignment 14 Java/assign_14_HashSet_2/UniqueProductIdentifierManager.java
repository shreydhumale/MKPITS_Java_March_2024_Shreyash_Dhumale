package assign_14_HashSet_2;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueProductIdentifierManager {
	HashSet<String> products=new HashSet<String>();
	
	public void addProduct(String product) {
		products.add(product);
	}
	
	public boolean checkProduct(String product) {
		return products.contains(product);
	}
	
	public void removeProduct(String product) {
		products.remove(product);
	}
	
	public void displayProducts() {
		for(String dispProduct:products) {
			System.out.println(dispProduct);
		}
	}
	
	public static void main(String[] args) {
		UniqueProductIdentifierManager U1=new UniqueProductIdentifierManager();
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("\nUnique Product identifier");
            System.out.println("1. Add a new product");
            System.out.println("2. Check if product exists");
            System.out.println("3. Remove product");
            System.out.println("4. Display all unique products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
			case 1:
				System.out.println("Enter product to add :");
				String productString=scanner.next();
				U1.addProduct(productString);
				break;
				
			case 2:
				System.out.println("Enter product to check if already exists :");
				String checkproductString=scanner.next();
				if(U1.checkProduct(checkproductString)) {
					System.out.println("product exists");
				}else {
					System.out.println("product does not exists");
				}
				break;
				
			case 3:
				System.out.println("Enter product to remove :");
				String removeProductString=scanner.next();
				U1.removeProduct(removeProductString);
				
			case 4:
				U1.displayProducts();
				break;
				
			case 5:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("invalid choice...");
				break;
			}
		
	}
}
}