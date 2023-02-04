package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>Post��� Query ���ڿ� ����</h1>");
		ServletInputStream input = req.getInputStream();
		int len = req.getContentLength();
		byte[] buf = new byte[len];
		input.readLine(buf, 0, len);
		String s = new String(buf);
		out.print("��ü ���ڿ� : " + s);
		out.println("</body></html>");
		out.close();
	}
}