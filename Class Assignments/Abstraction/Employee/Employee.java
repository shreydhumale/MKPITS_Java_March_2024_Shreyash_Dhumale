package Employee;

abstract class Employee {
    String empName;
    double paymentPerHour;
    Employee(String empName, double paymentPerHour ){
        this.empName=empName;
        this.paymentPerHour=paymentPerHour;
    }
    abstract double calculateSalary();

}
