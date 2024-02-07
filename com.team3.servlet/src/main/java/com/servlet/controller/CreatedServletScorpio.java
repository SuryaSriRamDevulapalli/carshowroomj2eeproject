package com.servlet.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

import com.servlet.encapsulated.Servletentity;
import com.team3.servlet.implementation.Implementation;

//@WebServlet("CreatedServlet")
public class CreatedServletScorpio extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CreatedServletScorpio() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        System.out.println("POST method triggered");
        
        String carname = request.getParameter("carname");
  
        String variant = request.getParameter("variant");
      
        String price = request.getParameter("price");
        int FEprice = 0;
        try {
        	FEprice = Integer.parseInt(price);
        } catch (NumberFormatException e) {
        	FEprice = 0; 
        }
        String transmission = request.getParameter("transmission");
    
            
        Servletentity mahindra = new Servletentity();
        mahindra.setCarname(carname);
        mahindra.setVariant(variant);
        mahindra.setPrice(FEprice);
        mahindra.setTransmission(transmission);
        
        Implementation imp = new Implementation();
			try {
				int result = imp.InsertmethodScorpioN(mahindra);
			
	
			HttpSession session = request.getSession();
			session.setAttribute("ScorpioNinsert", mahindra);
        
        
			RequestDispatcher success = request.getRequestDispatcher("/SuccessScorpio.jsp");
			RequestDispatcher failed = request.getRequestDispatcher("Failure.html");
			
			if(result>0) {
				success.forward(request, response);				
			}else {
				failed.forward(request, response);
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    	
    	System.out.println("GET methos id triggered");
    	
    	String variant = request.getParameter("variant");
    	Servletentity mahindra = new Servletentity();
    	mahindra.setVariant(variant);
    	Implementation imp = new Implementation();
    	try {
			Servletentity entity = imp.SearchScorpio(variant);
			HttpSession session = request.getSession();
			session.setAttribute("mahindraobject", entity);
			
			RequestDispatcher success = request.getRequestDispatcher("/MahhindraScorpioServlet");
			RequestDispatcher failed = request.getRequestDispatcher("/Failure.html");
			
			if(entity!=null) {
				success.forward(request, response);				
			}else {
				failed.forward(request, response);		
			}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
    }
}