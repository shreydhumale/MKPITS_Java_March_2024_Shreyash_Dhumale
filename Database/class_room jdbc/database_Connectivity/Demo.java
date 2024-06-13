package database_Connectivity;

import java.sql.SQLException;

import stud.Student;

public class Demo {
	  public static void main(String[] args) throws SQLException {
	        DBOperation dbOperation=new DBOperation();
//	        dbOperation.displayAll("film");

	    //dbOperation.displayById(12);
	        
//	    dbOperation.insertStudentRecord("20","Sourabh","duttwadi","Nagpur");
//	    dbOperation.insertStudentRecord("30","Kharanshu","Hingna","Nagpur");
//	    dbOperation.insertStudentRecord("40","Soumya","revsa","Amravati");
//	    dbOperation.insertStudentRecord("50","Amrut","Harshraj","Amravati");

	       
	     //dbOperation.deleteFromStudentRecord(30);
	        
	     //dbOperation.updateStudent(10,"Raj","xyz","Deihi");
	     
	     //dbOperation.insertStudentmarks("10", "80","85","90");
	        
	      Student student=new Student("60","Krushna","vidyut Nagar","Amravati");  
	     dbOperation.insertStudentRecord2(student);
	    }
}
