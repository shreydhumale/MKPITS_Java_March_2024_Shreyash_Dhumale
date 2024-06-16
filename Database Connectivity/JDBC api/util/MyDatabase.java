package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class MyDatabase {
	public static Connection myConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap56", "root", "#Shreyash444");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
	
	public static void closeConnection(PreparedStatement pst,Connection con) {
		try {
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void closeConnection(Resultset rs, PreparedStatement pst,Connection con) {
		try {
			((Connection) rs).close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
