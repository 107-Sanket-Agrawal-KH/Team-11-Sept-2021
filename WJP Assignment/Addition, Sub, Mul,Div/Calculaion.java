package com.cdac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form1
 */
@WebServlet("/Form")
public class Form2 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String str = request.getParameter("butn");
			String num1 = request.getParameter("Number1");
			String num2 = request.getParameter("Number2");
			PrintWriter out = response.getWriter();
			int a =  Integer.parseInt(num1);
			int b = Integer.parseInt(num2);
			if(str.equals("Add"))
			out.println("Addition = "+(a+b));
			if(str.equals("Sub"))
			out.println("Subsraction = "+(a-b));
			if(str.equals("Mul"))
			out.println("Multiplication = "+(a*b));
			if(str.equals("Div"))
			out.println("Division = "+(a/b));
	}
}
