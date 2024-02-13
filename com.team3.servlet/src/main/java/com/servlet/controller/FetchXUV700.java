package com.servlet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.servlet.encapsulated.Servletentity;
import com.team3.servlet.implementation.Implementation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class FetchXUV700 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public FetchXUV700() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get is triggered");
		Implementation imp = new Implementation();
		List<Servletentity> result;
		try {
			result = imp.FetchXUV700();
			HttpSession session = request.getSession();
			session.setAttribute("FetchXUV700", result);
			
			RequestDispatcher req =  request.getRequestDispatcher("/FetchXUV700.jsp");
			req.forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
