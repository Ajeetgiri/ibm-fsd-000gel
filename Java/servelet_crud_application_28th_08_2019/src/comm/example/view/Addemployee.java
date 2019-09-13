package comm.example.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import comm.example.factory.MyConnectionFactory;
import comm.example.model.Employee;


@WebServlet("/Addemployee")
public class Addemployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String name,email,password,country; 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
@SuppressWarnings("null")
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	// = new ArrayList();
	name = request.getParameter("name").toString();
	country = request.getParameter("country").toString();
	password = request.getParameter("password").toString();
	ArrayList<String> errMsgs = new ArrayList<String>();
	
	email=request.getParameter("email");
	if(name.toString().length()<5)
	{
		errMsgs.add("email enter should be correct");
	}
	
//	if(!errMsgs.isEmpty())
	
	if(errMsgs.isEmpty()) {
		request.setAttribute("SUCCESS", new Employee(name, password, email,country));
		Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
		PreparedStatement pst=connection.prepareStatement("insert into employe(name,password,email,country) values(?,?,?,?)");
		
	try {
		pst.setString(1, name);
		pst.setString(2, password);
		pst.setString(3, email);
		pst.setString(4, country);
		
		pst.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		RequestDispatcher  view=request.getRequestDispatcher("View");
		view.forward(request, response);
	
	}
else{
		
		request.setAttribute("ERROR", errMsgs);
		RequestDispatcher view=request.getRequestDispatcher("");
		view.forward(request, response);
		
	}
}
	}

