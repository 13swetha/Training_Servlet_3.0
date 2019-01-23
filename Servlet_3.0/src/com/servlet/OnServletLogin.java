package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class OnServletLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 PrintWriter pw= res.getWriter();
	  		res.setContentType("text/html");
	  		String user=req.getParameter("userName");
	  		String pass=req.getParameter("userPassword");
	  		if(user.equals("hai")&&pass.equals("hello"))
	  		{
	  			RequestDispatcher dispatcher =req.getRequestDispatcher("/home");
	  			dispatcher.forward(req, res);
	  		}
	  		else
	  		{
	  			pw.println("Login has failed");
	  		}
	  		pw.close();
		
	}

}
