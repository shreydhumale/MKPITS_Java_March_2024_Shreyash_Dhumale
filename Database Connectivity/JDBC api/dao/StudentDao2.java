package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.*;
import com.util.MyDatabase;

public class StudentDao2 {
	public int insertStudent(Student s) {
		int check =0;
		Connection con=MyDatabase.myConnection();
		String sql="insert into student(sname,scity,spercentage)values(?,?,?)";
		PreparedStatement pst=null;
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, s.getSname());
			pst.setString(2,s.getScity());
			pst.setDouble(3, s.getSpercentage());
			check=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			MyDatabase.closeConnection(pst, con);
		}
		return check;
	}
	
	public int deleteStudentBySid(int sid) {
		int check=0;
		Connection con=MyDatabase.myConnection();
		String sql="delete from student where sid=?";
		PreparedStatement pst=null;
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, sid);
			check=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			MyDatabase.closeConnection(pst, con);
		}
		return check;
	}
	public Student findStudentBySid(int sid) {
		Student student=null;
		Connection con=MyDatabase.myConnection();
		PreparedStatement pst=null;
		ResultSet rs=null;
		
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
			MyDatabase.closeConnection(pst, con);
		}
		return student;
	}
	
	public List<Student> findAllStudent() {
		List<Student>list=new ArrayList<Student>();
		Connection con=MyDatabase.myConnection();
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			MyDatabase.closeConnection(pst, con);
		}
		return list;
}
	
	public int updateStudent(Student s) {
		int check=0;
		Connection con=MyDatabase.myConnection();
		PreparedStatement pst=null;
		try {
				String sql="update student set sname=?,scity=?,spercentage=? where sid=?";
				pst=con.prepareStatement(sql);
				pst.setString(1,s.getSname());
				pst.setString(2,s.getScity());
				pst.setDouble(3,s.getSpercentage());
				pst.setInt(4,s.getSid());
				check=pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				MyDatabase.closeConnection(pst, con);
			}
		return check;
	}
}
