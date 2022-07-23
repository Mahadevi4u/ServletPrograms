package com.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	 System.out.println("Started First Servlet");
	RequestDispatcher rd = req.getRequestDispatcher("SecondServlet");
	 rd.forward(req, res);
	 
 }
       
   

}
