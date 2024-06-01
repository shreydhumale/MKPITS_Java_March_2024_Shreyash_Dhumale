package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.util.MyDatabase;

//Using Resource Block(from java 1.8)

public class StudentDao3 {
	public int insertStudent(Student s) {
		int check =0;
		String sql="insert into student(sname,scity,spercentage)values(?,?,?)";
		try(Connection con=MyDatabase.myConnection();
				PreparedStatement pst=con.prepareStatement(sql);
				) {
			pst.setString(1, s.getSname());
			pst.setString(2,s.getScity());
			pst.setDouble(3, s.getSpercentage());
			check=pst.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	
	public int deleteStudentBySid(int sid) {
		int check=0;
		String sql="delete from student where sid=?";
		try(Connection con=MyDatabase.myConnection();
			PreparedStatement pst=con.prepareStatement(sql);) {
			pst.setInt(1, sid);
			check=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	
	public Student findStudentBySid(int sid) {
			Student student=null;
			String sql="select sid,sname,scity,spercentage from student where sid=?";
			try (Connection con=MyDatabase.myConnection();
				PreparedStatement pst=con.prepareStatement(sql);){
	
			pst.setInt(1, sid);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				student=new Student();
				student.setSid((int)rs.getObject("sid"));
				student.setSname((String)rs.getObject("sname"));
				student.setScity((String)rs.getObject("scity"));
				student.setSpercentage((double)rs.getObject("spercentage"));
			}rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return student;
}
	public List<Student> findAllStudent() {
		List<Student>list=new ArrayList<Student>();
		String sql="select sid,sname,scity,spercentage from student";

		try (Connection con=MyDatabase.myConnection();
			 PreparedStatement pst=con.prepareStatement(sql);
				ResultSet rs=pst.executeQuery();
				){
			while(rs.next()) {
				Student student=new Student();
				student.setSid((int)rs.getObject("sid"));
				student.setSname((String)rs.getObject("sname"));
				student.setScity((String)rs.getObject("scity"));
				student.setSpercentage((double)rs.getObject("spercentage"));
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
}
	
	public int updateStudent(Student s) {
		int check=0;
		String sql="update student set sname=?,scity=?,spercentage=? where sid=?";

		try (Connection con=MyDatabase.myConnection();
				PreparedStatement pst=con.prepareStatement(sql);
)	{			
				pst.setString(1,s.getSname());
				pst.setString(2,s.getScity());
				pst.setDouble(3,s.getSpercentage());
				pst.setInt(4,s.getSid());
				check=pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				}
		return check;
	}
}