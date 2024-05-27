package Employee;

public class FullTimeEmployee extends Employee{
    int workingHours;

    FullTimeEmployee(String empName,double paymentPerHour,int workingHours){
        super(empName,paymentPerHour);
        this.workingHours=workingHours;
    }
    @Override
    double calculateSalary() {
        return paymentPerHour*workingHours*40;
    }
}
