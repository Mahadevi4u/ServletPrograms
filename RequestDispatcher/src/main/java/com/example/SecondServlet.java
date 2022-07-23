package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	  PrintWriter out = res.getWriter();
	  System.out.println("Started Second Servlet");
	  res.sendRedirect("ThirdServlet");
  }

}
