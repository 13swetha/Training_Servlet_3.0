package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home")
public class home extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		String user=req.getParameter("userName");
		String pass=req.getParameter("userPassword");
		pw.println("user name :"+user+"\npassword :"+pass);
		pw.close();
		// TODO Auto-generated method stub
	}

}
