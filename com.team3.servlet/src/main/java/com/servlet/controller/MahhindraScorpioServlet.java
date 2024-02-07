package com.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.encapsulated.Servletentity;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MahhindraScorpioServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public MahhindraScorpioServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("mahindraobject");
		Servletentity mahindra = null;
		if(obj != null) {
			mahindra = (Servletentity) obj;
		}
		
		//Servletentity mahindra = null; initializes the mahindra variable to null.
		//This assumes that "mahindraobject" is an attribute previously set in the session and its value is an instance of Servletentity. The retrieved value is cast to Servletentity and assigned to the variable mahindra.
		//which is retrieved from CreatedServletScorpio
		//Object obj = session.getAttribute("mahindraobject"); retrieves an object from the session with the attribute name "mahindraobject" and assigns it to the obj variable.
		//This line retrieves an object previously stored in the session with the specified attribute name.
		
		
		//Servletentity mahindra = (Servletentity) session.getAttribute("mahindraobject");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><body>");
		pw.print("   <style>\r\n"
				+ "    body{\r\n"
				+ "		background-image: url(https://auto.mahindra.com/-/media/project/mahindra/dotcom/mahindra/dark-theme-mahindra-images/gallery/testz101/photos/popup-images/z101_2-1920x1080.jpg?rev=abd58b886317469da1aeb4412f6d9fb6&extension=webp);\r\n"
				+ "		background-repeat: no-repeat;\r\n"
				+ "		background-position: center;\r\n"
				+ "		background-size:  50%;\r\n"
				+ "		background-attachment: fixed;\r\n"
				+ "		font-family: Arial, sans-serif;		\r\n"
				+ "		color: black;		\r\n"
				+ "		margin: 0;\r\n"
				+ "        padding: 0;\r\n"
				+ "        \r\n"
				+ "	}\r\n"
				+ "        table {\r\n"
				+ "            width: 20%;\r\n"
				+ "            \r\n"
				+"margin-top:  150px;"
				+ "        }\r\n"
				+ "        th, td {\r\n"
				+ "            border: 3px solid wheat;\r\n"
				+ "         	padding: 8px;\r\n"
				+ "        	text-align: left;\r\n"		
				+ "        }\r\n"
				+ "        th {\r\n"
				+ "            background-color: wheat;\r\n"
				+ "        }\r\n"
				+ "        h1{\r\n"
				+ "        background-color: wheat;\r\n"
				+ "		margin-top:  0;\r\n"
				+ "        margin-bottom: 0;\r\n"
				+ "        padding: 20px;\r\n"
				+ "        }\r\n"
				+ "        .bottom-bar {\r\n"
				+ "    background-color: wheat;\r\n"
				+ "    height: 100px;\r\n"
				+ "    width: 100%;\r\n"
				+ "    position: fixed;\r\n"
				+ "    bottom: 0;\r\n"
				+ "    left: 0;\r\n"
				+ "}\r\n"
				+ "    </style>");
		pw.write("<h1 align = \"center\"> Below are the retrieved details from Mahindra Database!! </h1>");
		pw.write("<table>");
		pw.print("<tr><th>Details</th><th>Values</th></tr>");
		pw.print("<tr><td>Car Name:</td><td>"+mahindra.getCarname()+"</td></tr>");
		pw.print("<tr><td>Variant:</td><td>"+mahindra.getVariant()+"</td></tr>");
		pw.print("<tr><td>Price:</td><td>"+mahindra.getPrice()+"</td></tr>");
		pw.print("<tr><td>Transmission:</td><td>"+mahindra.getTransmission()+"</td></tr>");
		pw.print("</table>");
		
		pw.write("<div class=\"bottom-bar\">\r\n"
				+ "<button onclick=\"window.location.href='index.html';\"style=\"font-size: 15px; padding: 10px 20px; background-color: black; color: wheat; border: none; border-radius: 5px; cursor: pointer;\">Back to Homepage</button>\r\n"
				+ "</div>");
		
		pw.print("</table></body></html>");
	}
}
