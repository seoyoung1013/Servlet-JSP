package com.edu.test;

import javax.servlet.*;

public class FlowFilterTwo implements Filter {
	
	String charset;
	public void init(FilterConfig config) {
		System.out.println("init() ȣ�� ......... two");
		charset = config.getInitParameter("en");
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws java.io.IOException, ServletException {
		req.setCharacterEncoding(charset);
		System.out.println("doFilter() ȣ�� �� ........ two");
		chain.doFilter(req, res);
		System.out.println("doFilter() ȣ�� �� ........ two");
	}

	public void destroy() {
		System.out.println("destroy() ȣ�� ........ two");
	}
}
