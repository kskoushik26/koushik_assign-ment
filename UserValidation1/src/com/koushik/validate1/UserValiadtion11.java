package com.koushik.validate1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserValiadtion11")
public class UserValiadtion11 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String userName,password;
	 PrintWriter out  = response.getWriter();
	 userName =request.getParameter("userName");
	 password=request.getParameter("password");
	 String userType="Invalid";
	 userType = getUserType(userName, password);
     RequestDispatcher requestDispatcher = null;
     
     if (userType.equals("Admin"))
     {
    	 out.print("Welcome Admin");
     requestDispatcher = request.getRequestDispatcher("/admin");
     requestDispatcher.forward(request, response);
     }
     else if (userType.equals("User")) {
			out.print("<h1>Welcome User  " + userName + "</h1>");
		} else {
			//requestDispatcher = request.getRequestDispatcher("/invalid");
			out.print("<h1>Invalid User</h1>");
		}
 	
	}

	private String getUserType(String userName, String password) {
		UserDAO userdao = new UserDAO();
	
		return userdao.getUserType(userName,password) ;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
