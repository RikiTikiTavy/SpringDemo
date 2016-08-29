package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name = "/C3 Chocolate", urlPatterns = "/SelectChocolate.do")
public class ChocolateSelect extends HttpServlet{
		public void doPost(HttpServletRequest request, 
				HttpServletResponse response) throws IOException, ServletException {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("Chocolate Selection Advise <br>");
			String sc = request.getParameter("color");
			
			ChocolateExpert expert = new ChocolateExpert();
			ArrayList<String> result = expert.getBrands(sc);
			
			for(String s: result){
				out.println("<br>Nice choice! You have to try " + s);
			}
		}
}
