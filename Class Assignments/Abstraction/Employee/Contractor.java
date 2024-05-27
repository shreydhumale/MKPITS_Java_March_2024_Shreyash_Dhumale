package Employee;

public class Contractor extends Employee {
    int workingHours;

    Contractor(String empname, double paymentPerHour,int workingHours){
        super(empname,paymentPerHour);
        this.workingHours=workingHours;
    }

    @Override
    double calculateSalary() {
        return paymentPerHour*workingHours;
    }
}
