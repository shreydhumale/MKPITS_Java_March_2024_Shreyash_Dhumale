package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.util.MyDatabase;

public class Practice {
	public List<Student> findStudentByAny(String value){
		List<Student> list=new ArrayList<Student>();
		String sql="select sid,sname,scity,spercentage from student where sname like '%"+value+"%' "
				+ "or scity like'%"+value+"%'";
		boolean b=false;
		for(int i=0;i<value.length();i++)
			if(Character.isAlphabetic(value.charAt(i)))
				b=true;
		if(!b)
			sql+="or sid="+value+" or spercentage="+value;
		
		try (Connection con=MyDatabase.myConnection();
				PreparedStatement pst=con.prepareStatement(sql);
				ResultSet rs=pst.executeQuery();)
		{
			while(rs.next()) {
				Student student=new Student();
				student.setSid((int)rs.getObject("sid"));
				student.setSname((String)rs.getObject("sname"));
				student.setScity((String)rs.getObject("scity"));
				student.setSpercentage((double)rs.getObject("spercentage"));
				list.add(student);
			}
			rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	return list;
	}
}
