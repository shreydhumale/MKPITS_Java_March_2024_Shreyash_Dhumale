package assign_14_HashSet_1;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueEmailCollector {
	HashSet<String> emails = new HashSet<String>();
	
	public void addEmail(String email) {
		emails.add(email);
	}
	
	public boolean checkEmail(String email) {
		return emails.contains(email);
	}
	
	public void removeEmail(String email) {
		emails.remove(email);
	}
	
	public void displayEmail() {
		for(String email:emails) {
			System.out.println(email);
		}
	}
	
	public static void main(String[] args) {
		UniqueEmailCollector E1=new UniqueEmailCollector();
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("\nUnique Email Collector");
            System.out.println("1. Add a new email address");
            System.out.println("2. Check if an email address exists");
            System.out.println("3. Remove an email address");
            System.out.println("4. Display all unique email addresses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
            case 1:
            	System.out.println("Enter Email :");
            	String emailToAdd=scanner.next();
            	E1.addEmail(emailToAdd);
            	break;
            	
            case 2:
            	System.out.println("Enter email to check :");
            	String emailToCheck=scanner.next();
            	if(E1.checkEmail(emailToCheck)) {
            		System.out.println("Email exists");
            	}else {
            		System.out.println("Email doesn't exists");
            	}
            	break;
            	
            case 3:
            	System.out.println("Enter Email to remove :");
            	String removeEmail=scanner.next();
            	E1.removeEmail(removeEmail);
            	break;
            	
            case 4:
            	E1.displayEmail();
            	break;
            	
            case 5:
            	System.out.println("Exiting..");
            	return;
            	
            	default:
            		System.out.println("invalid choice...");
            		break;
            }
		}
	}
}
