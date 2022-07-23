package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		int age = (int) session.getAttribute("age");
		String address = session.getAttribute("address").toString();
		
		PrintWriter out = res.getWriter();
		out.println("<html><body><h2>Name : "+name+"</h2><h2>Age : "+age+"</h2><h2>Address : <i>"+address+"</i></h2></body></html>");
		
	}
}
