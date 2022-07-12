package com.Registration.Form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class RegistrationForm_1 {

	public static Connection conn=null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		if(conn==null)
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resistrationform","root","Selvan@2001");
		}
		return conn;
	}
	
	public static ResultSet executeQuery(String query) throws ClassNotFoundException, SQLException
	{
		Statement stmt=getConnection().createStatement();
		ResultSet rs=stmt.executeQuery(query);
		return rs;
	}
	
	public static String getMyData(ResultSet rs,int index) throws SQLException
	{
		return rs.getString(index);
	}
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resistrationform","root","Selvan@2001");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM resistrationform.new_table;");
			while(rs.next()) {
//				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
				System.out.println(rs);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	

}
