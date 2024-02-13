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

public class FetchThar extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public FetchThar() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get is triggered");
		Implementation imp = new Implementation();
		List<Servletentity> result;
		try {
			result = imp.FetchThar();
			HttpSession session = request.getSession();
			session.setAttribute("FetchThar", result);
			
			RequestDispatcher req =  request.getRequestDispatcher("/FetchThar.jsp");
			req.forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
