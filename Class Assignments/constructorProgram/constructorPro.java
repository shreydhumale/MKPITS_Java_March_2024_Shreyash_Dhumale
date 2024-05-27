public class constructorPro {
    String Empname;
    String Department;
    int Id;
    float salary;

    public constructorPro(String Empname, String Department, int Id, float salary) {
    Empname="Shreyash";
    Department="Electronics";
    Id=76867576;
    salary= 50000;
    }

    public String getEmpname(){
        return Empname;
    }
    public String getDepartment(){
        return Department;
    }
    public int getId(){
        return Id;
    }
    public float getSalary(){
        return salary;
    }
}
