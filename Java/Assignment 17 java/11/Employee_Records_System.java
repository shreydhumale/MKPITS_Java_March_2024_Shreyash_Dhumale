package assignment_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee_Records_System 
 {
    private static HashMap<Integer, Employee> employeeRecords = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEmployee Records Management System:");
            System.out.println("1. Add/Update employee record");
            System.out.println("2. Delete employee record");
            System.out.println("3. Retrieve employee record");
            System.out.println("4. List all employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addOrUpdateEmployee();
                    break;
                case 2:
                    deleteEmployee();
                    break;
                case 3:
                    retrieveEmployee();
                    break;
                case 4:
                    listAllEmployees();
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

    private static void addOrUpdateEmployee() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, department, salary);
        employeeRecords.put(id, employee);
        System.out.println("Employee record added/updated successfully.");
    }

    private static void deleteEmployee() {
        System.out.print("Enter employee ID to delete: ");
        int id = scanner.nextInt();
        if (employeeRecords.remove(id) != null) {
            System.out.println("Employee record deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void retrieveEmployee() {
        System.out.print("Enter employee ID to retrieve: ");
        int id = scanner.nextInt();
        Employee employee = employeeRecords.get(id);
        if (employee != null) {
            System.out.println("Employee record: " + employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void listAllEmployees() {
        System.out.println("List of all employees:");
        for (Map.Entry<Integer, Employee> entry : employeeRecords.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}