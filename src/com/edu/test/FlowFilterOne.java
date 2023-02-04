package com.edu.test;

import javax.servlet.*;

public class FlowFilterOne implements Filter {
	public void init(FilterConfig config) {
		System.out.println("init() ȣ�� ......... one");
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws java.io.IOException, ServletException {
		System.out.println("doFilter() ȣ�� �� ........ one");
		chain.doFilter(req, res);
		System.out.println("doFilter() ȣ�� �� ........ one");
	}

	public void destroy() {
		System.out.println("destroy() ȣ�� ........ one");
	}
}
