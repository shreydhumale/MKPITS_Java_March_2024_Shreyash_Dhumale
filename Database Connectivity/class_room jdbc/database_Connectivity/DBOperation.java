package database_Connectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import stud.Student;

public class DBOperation {
	public void displayAll(String table) {
        Connection con=MyDatabase.myConnection();
        try {
            Statement statement= con.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from "+table);
            System.out.println(resultSet);
            ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
            int columnount= resultSetMetaData.getColumnCount();
            for(int i=1;i<columnount;i++){
                System.out.println(resultSetMetaData.getColumnName(i));
            }
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+ resultSet.getString(2)+" "+resultSet.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void displayById(int actor_id) throws SQLException {
        Connection connection=MyDatabase.myConnection();
        String sql="select * from actor where actor_id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1, actor_id);
        ResultSet resultSet=preparedStatement.executeQuery();
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int count=resultSetMetaData.getColumnCount();
        if(resultSet.next()){
            for(int i=1; i<=count;i++){
                System.out.println(resultSet.getString(i));
            }
        }
    }
    public int insertStudentRecord(String rollNo, String sName, String address, String sCity) throws SQLException {
        int check=0;
    	Connection connection=MyDatabase.myConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("insert into studentdetails values(?,?,?,?)");
        preparedStatement.setString(1,rollNo);
        preparedStatement.setString(2,sName);
        preparedStatement.setString(3,address);
        preparedStatement.setString(4, sCity);
        check=preparedStatement.executeUpdate();
        return check;
    }
    
    public int updateStudent(int RollNo, String sName, String address, String sCity) throws SQLException {
    	Connection connection=MyDatabase.myConnection();
    	PreparedStatement preparedStatement=connection.prepareStatement("update studentdetails set Name=?, Address=?, City=? where Rollno=?");
    	preparedStatement.setString(1,sName);
    	preparedStatement.setString(2,address);
    	preparedStatement.setString(3,sCity);
    	preparedStatement.setInt(4,RollNo);

    	int result=preparedStatement.executeUpdate();
    	
    	if (result==1) {
    		System.out.println("updated");
    	}
    	else {
			System.out.println("update failed");
		}

		return 0;
    }
    
    // to delete records from studentdetails table
    public int deleteFromStudentRecord(int RollNo) throws SQLException {
    	Connection connection=MyDatabase.myConnection();
    	PreparedStatement preparedStatement=connection.prepareStatement("delete from studentdetails where RollNo=?");
    	preparedStatement.setInt(1, RollNo);
    	preparedStatement.executeUpdate();
		return 0;
    	
    }
    public int insertStudentmarks(String rollNo, String phy, String che, String maths) throws SQLException {
        int check=0;
    	Connection connection=MyDatabase.myConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("insert into marksdetails values(?,?,?,?)");
        preparedStatement.setString(1,rollNo);
        preparedStatement.setString(2,phy);
        preparedStatement.setString(3,che);
        preparedStatement.setString(4,maths);
        check=preparedStatement.executeUpdate();
        return check;
    }
    
    
    //By using model class(Student)
    public int insertStudentRecord2(Student student) throws SQLException {
        int check=0;
    	Connection connection=MyDatabase.myConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("insert into studentdetails values(?,?,?,?)");
        preparedStatement.setString(1,student.getRollNo());
        preparedStatement.setString(2,student.getsName());
        preparedStatement.setString(3,student.getsAddress());
        preparedStatement.setString(4,student.getsCity());
        check=preparedStatement.executeUpdate();
        return check;
    }
}

