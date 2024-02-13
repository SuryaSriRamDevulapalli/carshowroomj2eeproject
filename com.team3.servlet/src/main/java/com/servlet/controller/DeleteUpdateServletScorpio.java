package com.servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.servlet.encapsulated.Servletentity;
import com.team3.servlet.implementation.Implementation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DeleteUpdateServletScorpio extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public DeleteUpdateServletScorpio() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET Triggered");
		String variant = request.getParameter("variant");
		String transmission = request.getParameter("transmission");
		
		Servletentity mahindra = new Servletentity();
		mahindra.setVariant(variant);
		mahindra.setTransmission(transmission);
		
		Implementation imp = new Implementation();
		int result;
		try {
			result = imp.deleteScorpio(mahindra);
			RequestDispatcher success = request.getRequestDispatcher("/DeleteScorpio.jsp");
			RequestDispatcher failure = request.getRequestDispatcher("/Failure.html");
			
			if(result>0) {
				success.forward(request, response);
			}
			else {
				failure.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post Method is triggered");
		
		
		String transmission = request.getParameter("transmission");
		String price = request.getParameter("price");
		int fprice = 0;
		try {
			fprice = Integer.parseInt(price);
		}
		catch (Exception e) {
			fprice = 0;
		}
		String variant = request.getParameter("variant");
		
		
		
		Servletentity entity = new Servletentity();	
		entity.setTransmission(transmission);
		entity.setPrice(fprice);
		entity.setVariant(variant);
		
		
		Implementation imp = new Implementation();
		int result;
		try {
			result = imp.updateScorpio(entity);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("updateScorpioN", entity);
		
		RequestDispatcher success = request.getRequestDispatcher("Success1.jsp");
		RequestDispatcher failed = request.getRequestDispatcher("Failure.html");
		
		if(result>0) {
			success.forward(request, response);
		}
		else {
			failed.forward(request, response);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
