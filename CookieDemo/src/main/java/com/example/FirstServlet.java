package com.example;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String address = req.getParameter("address");
		
		/*
		 * HttpSession session = req.getSession(); session.setAttribute("name", name);
		 * session.setAttribute("age", age); session.setAttribute("address", address);
		 */
		Cookie n = new Cookie("name",URLEncoder.encode(name,"UTF-8"));
		Cookie a = new Cookie("age",URLEncoder.encode(age,"UTF-8"));
		Cookie add = new Cookie("address",URLEncoder.encode(address,"UTF-8"));
		
		res.addCookie(a);
		res.addCookie(add);
		res.addCookie(n);
		res.sendRedirect("SecondServlet");
	}
}
