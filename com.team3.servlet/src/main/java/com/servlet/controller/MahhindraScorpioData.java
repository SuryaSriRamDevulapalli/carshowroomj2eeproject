package com.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.encapsulated.Servletentity;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("unused")
public class MahhindraScorpioData extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public MahhindraScorpioData() {
		super();
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		HttpSession session =  request.getSession(); //etrieves the current session associated with the request. If a session doesn't exist, it creates a new one.
//		Object obj = session.getAttribute("mahindraobject");
//		Servletentity mahindra = null;
//		if(obj != null) {
//			mahindra = (Servletentity) obj;
//		}
		
		Servletentity mahindra = (Servletentity) session.getAttribute("mahindraobject");//This assumes that "mahindraobject" is an attribute previously set in the session and its value is an instance of Servletentity. The retrieved value is cast to Servletentity and assigned to the variable mahindra.
		//which is retrieved from CreatedServletScorpio
		
		///there is no need of request dispatcher as we already gave in html
//		RequestDispatcher rd = request.getRequestDispatcher("/MahhindraScorpioServlet");
//		session.setAttribute("mahindraobject",rd);	
		PrintWriter out = response.getWriter();
		out.print("HI");
		out.print("<html><body><table>");
		out.print("<buttton>");
		out.print("<a href = 'MahhindraScorpioServlet'>Data</a>");
		out.print("</buttton>");
		out.print("</table></body></html>");
	}

}
