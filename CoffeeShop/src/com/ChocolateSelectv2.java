package com;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "/C3 Chocolate", urlPatterns = "/SelectChocolate.do")

public class ChocolateSelectv2 extends HttpServlet{
		public void doPost(HttpServletRequest request, 
				HttpServletResponse response) throws IOException, ServletException{
			
			String c = request.getParameter("color");
			
			ChocolateExpert expert = new ChocolateExpert();
			ArrayList<String> list = expert.getBrands(c);
			
			request.setAttribute("styles", list);
			
			RequestDispatcher view = request.getRequestDispatcher("jspForm.jsp");
			view.forward(request, response);
		}
}
