package com.Registration.Form;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		out.print("Working");
		
		String First_Name=request.getParameter("First_Name");
		String Last_Name=request.getParameter("Last_Name");
		String Birthday_day= request.getParameter("Birthday_Day");
		String Birthday_Month=request.getParameter("Birthday_Month");
		int Birthday_Year=Integer.parseInt(request.getParameter("Birthday_Year"));
		String Email_Id=request.getParameter("Email_Id");
		String Mobile_Number=request.getParameter("Mobile_Number");
		String Gender=request.getParameter("Gender");
		String Address=request.getParameter("Address");
		String City=request.getParameter("City");
		int Pin_Code=Integer.parseInt(request.getParameter("Pin_Code"));
		String State=request.getParameter("State");
		String Country=request.getParameter("Country");
		String ClassX_Board=request.getParameter("ClassX_Board");
		int ClassX_Percentage=Integer.parseInt(request.getParameter("ClassX_Percentage"));
		String ClassX_YrOfPassing=request.getParameter("ClassX_YrOfPassing");
		String ClassXII_Board=request.getParameter("ClassXII_Board");
		int ClassXII_Percentage=Integer.parseInt(request.getParameter("ClassXII_Percentage"));
		int ClassXII_YrOfPassing=Integer.parseInt(request.getParameter("ClassXII_YrOfPassing"));
		String Polytechnic_Board=request.getParameter("Polytechnic_Board");
		int Polytechnic_Percentage=Integer.parseInt(request.getParameter("Polytechnic_Percentage"));
		int Polytechnic_YrOfPassing=Integer.parseInt(request.getParameter("Polytechnic_YrOfPassing"));
		String Course=request.getParameter("Course");
		
		out.println(First_Name);
		out.println(Last_Name);
		out.println(Birthday_day);
		out.println(Birthday_Month);
		out.println(Birthday_Year);
		out.println(Email_Id);
		out.println(Mobile_Number);
		out.println(Gender);
		out.println(Address);
		out.println(City);
		out.println(Pin_Code);
		out.println(State);
		out.println(Country);
		out.println(ClassX_Board);
		out.println(ClassX_Percentage);
		out.println(ClassX_YrOfPassing);
		out.println(ClassXII_Board);
		out.println(ClassXII_Percentage);
		out.println(ClassXII_YrOfPassing);
		out.println(Polytechnic_Board);
		out.println(Polytechnic_Percentage);
		out.println(Polytechnic_YrOfPassing);
		out.print(Course);
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql:// localhost:3306/resistrationform.new_table","root","Selvan@2001");
//			Statement stmt=con.createStatement();
	//		String queryToExecute="";
		PreparedStatement pst= RegistrationForm_1.getConnection().prepareStatement("insert into users(First_Name,Last_Name,Birthday_day,Birthday_Month,Birthday_Year,Email_Id,Mobile_Number,Gender,Address,City,Pin_Code,State,Country,ClassX_Board,ClassX_Percentage,ClassX_YrOfPassing,ClassXII_Board,ClassXII_Percentage,ClassXII_YrOfPassing,Polytechnic_Board,Polytechnic_Percentage,Polytechnic_YrOfPassing,Course)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
