package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.mysql.cj.protocol.Resultset;

public class StudentDao {
	public int insertStudent(Student s) {
		int check=0;
		Connection con=null;
		PreparedStatement pst=null;
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap56", "root", "#Shreyash444");
				String sql="insert into student(sname,scity,spercentage)values(?,?,?)";
				pst=con.prepareStatement(sql);
				pst.setString(1, s.getSname());
				pst.setString(2,s.getScity());
				pst.setDouble(3, s.getSpercentage());
				check=pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        finally {
        	try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }

		return check;
	}
	
	public int deleteStudentBySid(int sid) {
		int check=0;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap56", "root", "#Shreyash444");
				String sql="delete from student where sid=?";
				pst=con.prepareStatement(sql);
				pst.setInt(1, sid);
				check=pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return check;
	}
	
	public Student findStudentBySid(int sid) {
		Student student=null;
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap56", "root", "#Shreyash444");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String sql="select sid,sname,scity,spercentage from student where sid=?";
			try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, sid);
			rs=pst.executeQuery();
			while(rs.next()) {
				student=new Student();
				student.setSid((int)rs.getObject("sid"));
				student.setSname((String)rs.getObject("sname"));
				student.setScity((String)rs.getObject("scity"));
				student.setSpercentage((double)rs.getObject("spercentage"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;
	}
	
	public List<Student> findAllStudent() {
		List<Student>list=new ArrayList<Student>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap56", "root", "#Shreyash444");
			String sql="select sid,sname,scity,spercentage from student";
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				Student student=new Student();
				student.setSid((int)rs.getObject("sid"));
				student.setSname((String)rs.getObject("sname"));
				student.setScity((String)rs.getObject("scity"));
				student.setSpercentage((double)rs.getObject("spercentage"));
				list.add(student);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public int updateStudent(Student s) {
		int check=0;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap56", "root", "#Shreyash444");
				String sql="update student set sname=?,scity=?,spercentage=? where sid=?";
				pst=con.prepareStatement(sql);
				pst.setString(1,s.getSname());
				pst.setString(2,s.getScity());
				pst.setDouble(3,s.getSpercentage());
				pst.setInt(4,s.getSid());
				check=pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}
}
