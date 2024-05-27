package Employee;

public class MainClass {
    public static void main(String[] args) {
        Contractor contractor=new Contractor("shreyash", 25.0,50);
        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee("yash",30.0,45);

        System.out.println("contractor salary="+contractor.calculateSalary());
        System.out.println("Full time employee salary="+fullTimeEmployee.calculateSalary());
    }

}

