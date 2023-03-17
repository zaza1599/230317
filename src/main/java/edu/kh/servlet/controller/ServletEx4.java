package edu.kh.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx4 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String orderer = req.getParameter("orderer");
	String chicken = req.getParameter("chicken");
	String sidemenu = req.getParameter("sidemenu");
	
	System.out.println(orderer + " : ");
	System.out.println(chicken + " : ");
	System.out.println(sidemenu + " : ");
	
	resp.setContentType("text/html; charset=UTF-8");
	
	PrintWriter out = resp.getWriter();
	
	
	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head> <title> 메뉴 확인 </title> </head>");
	
	out.println("<body>");
	
	out.printf("<h3>주문자명 : %s</h3>\n", orderer);
	out.printf("<h3>치킨 : %s</h3>\n", chicken);
	out.printf("<h3>사이드 메뉴 : %s</h3>\n", sidemenu);
	
	out.println("</body>");
	out.println("</html>");
	
	
	
	
	}
}

