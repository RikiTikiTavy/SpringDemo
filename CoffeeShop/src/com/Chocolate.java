package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(name = "/C3 Chocolate", urlPatterns = "/SelectChocolate.do")
public class Chocolate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String c = request.getParameter("color");
		
		out.println("<h3>Select chocolate</h3>");
		out.println("<h3>Take a " + c + " chocolate</h3>");
		out.close();
	}

}
