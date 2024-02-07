package com.servlet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("unused")
public class JDBC{
	
	static JDBC mysql = new JDBC();
	static Connection connect;
	
	private JDBC() {///constructor
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//// search for driver
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahindra","root","Season*7*");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
	public static Connection getinstance() { ///method of access		
		return mysql.connect;		
	}
	
	public static void main(String[] args) throws SQLException { //developer convenience
		System.out.println(JDBC.getinstance());
//		Connection connect = getinstance();
//		String query = "select * from cars";
//		Statement st = connect.createStatement();
//		ResultSet rs = st.executeQuery(query);
//		
//		while(rs.next()) {
//			System.out.print(rs.getString("carname") + " | ");
//			System.out.print(rs.getString("variant") + " | ");
//			System.out.print(rs.getInt("price") + " | ");
//			System.out.print(rs.getString("transmission") + " | ");
//			System.out.println(" ");						
//		}
		
	}
	
}