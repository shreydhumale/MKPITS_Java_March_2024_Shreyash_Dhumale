public class Employee {
    String empid;
    String name;
    static String company="TCS";

        Employee(String empid, String name, String company){
        this.empid=empid;
        this.name=name;
    }

    public void display(){
        System.out.println(empid+" "+name+" "+company);
    }

    public static void main(String[] args) {
        Employee e1=new Employee("sh23876","Shreyash",company);
        e1.display();
        Employee e2=new Employee("yd876","yash",company);
        e2.display();
    }
}
