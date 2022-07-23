package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ThirdServlet")

public class ThirdServlet extends HttpServlet{
	
private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	  PrintWriter out = res.getWriter();
	  out.println("<html><body><h2><i>Heyy Can you see my name in the address bar !!!</h2></body></html>");
	  
	  
}


}
