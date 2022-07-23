package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		ServletConfig obj = getServletConfig();
		String name = obj.getInitParameter("name");
		String hobby = obj.getInitParameter("Hobbies");
		
		PrintWriter out = res.getWriter();
		out.println("<html><body><h2>My name is <i>"+name+".<br></i>My hobby is  <i>"+hobby+"</i></h2></body></html>");
		
	}

}
