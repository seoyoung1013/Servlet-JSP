package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/errorTest2")
public class ErrorTest2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		try {
			String getquery = req.getQueryString();
			out.print("Query : " + getquery + "<br>");
			out.print("Query ���� : " + getquery.length());

		} catch (Exception e) {
			out.print("��û�� ó���ϴ� ���� ������ �߻��Ͽ����ϴ� : " + e);
		}
		out.print("<br>Done!");
		out.close();
	}
}
