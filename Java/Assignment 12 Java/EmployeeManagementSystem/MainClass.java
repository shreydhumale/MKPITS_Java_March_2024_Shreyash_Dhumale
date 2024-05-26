package EmployeeManagementSystem;

public class MainClass {
    public static void main(String[] args) {
        Employee part_time = new Employee() {

            @Override
            public void displayDetails() {
                System.out.println("part time employee :");
            }

            @Override
            public void calSalary() {
                System.out.println("part time employee salary :");
            }
        };

        Employee full_time = new Employee() {

            @Override
            public void displayDetails() {
                System.out.println("fulltime employee :");
            }

            @Override
            public void calSalary() {
                System.out.println("fulltime  employee salary :");
            }
        };

        Employee contract_based = new Employee() {

            @Override
            public void displayDetails() {
                System.out.println();
            }

            @Override
            public void calSalary() {
                System.out.println();
            }
        };
    }
}
