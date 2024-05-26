package assign_14_HashSet_4;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueVisitorTracker {
    private HashSet<String> visitors = new HashSet<>();
    private HashSet<String> ipAddresses = new HashSet<>();

    public void addVisitor(String visitor, String ipAddress) {
        visitors.add(visitor);
        ipAddresses.add(ipAddress);
    }

    public boolean checkIPAddress(String ipAddress) {
        return ipAddresses.contains(ipAddress);
    }

    public void removeIPAddress(String ipAddress) {
        ipAddresses.remove(ipAddress);
    }

    public void displayIPAddresses() {
//            for (String ip : ipAddresses) {
//                System.out.println("visitor name: "+visitors+" Ip Address : "+ip);
//            }
    	
    		for(int i=0;i<ipAddresses.size()-1;i++) {
    			System.out.println("visitor name: "+visitors+" Ip Address : "+ipAddresses);
    		}
        }

    public static void main(String[] args) {
        UniqueVisitorTracker V1= new UniqueVisitorTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nUnique Visitor Tracker");
            System.out.println("1. Add a new visitor's IP address");
            System.out.println("2. Check if an IP address has visited before");
            System.out.println("3. Remove an IP address");
            System.out.println("4. Display all unique visitor IP addresses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch(choice) {

            case 1:
                System.out.print("Enter visitor name: ");
                String visitorName = scanner.nextLine();
                System.out.print("Enter IP address: ");
                String ipAddress = scanner.nextLine();
                V1.addVisitor(visitorName, ipAddress);
                System.out.println("IP address added successfully.");
                break;
           case 2: 
                System.out.print("Enter IP address to check: ");
                String ipToCheck = scanner.nextLine();
                if (V1.checkIPAddress(ipToCheck)) {
                    System.out.println("IP address has visited before.");
                } else {
                    System.out.println("IP address has not visited before.");
                }
                break;
            case 3:
                System.out.print("Enter IP address to remove: ");
                String ipToRemove = scanner.nextLine();
                V1.removeIPAddress(ipToRemove);
                break;
            case 4:
                V1.displayIPAddresses();
                break;
            case 5:
                System.out.println("Exiting...");
                scanner.close();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }
        }
    }
}
