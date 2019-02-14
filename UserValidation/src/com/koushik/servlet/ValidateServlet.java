package com.koushik.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koushik.util.DAOUtility;

@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName, password;
		PrintWriter out = response.getWriter();

		userName = request.getParameter("userName");
		password = request.getParameter("password");
		String userType = "Invalid";
		RequestDispatcher requestDispatcher = null;
		userType = getUserType(userName, password);
		if (userType.equals("admin")) {
			requestDispatcher = request.getRequestDispatcher("/AdminServlet");
		} else if (userType.equals("user")) {
			out.print("<h1>Welcome User  " + userName + "</h1>");
		} else {
			out.print("<h1>Invalid User</h1>");
		}
		requestDispatcher.forward(request, response);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	private String getUserType(String userName, String password) {
		return DAOUtility.getUserDAO().getUserType(userName, password);
	}
}