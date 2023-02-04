package com.edu.test;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;


public class TestServletContextListener implements ServletContextListener {
	public TestServletContextListener() {
		System.out.println("TestServletContextListener ��ü ����");
	}

	public void contextInitialized(ServletContextEvent e) {
		System.out.println("ServletContext ��ü �ʱ�ȭ");
	}

	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("ServletContext ��ü ����");
	}
}
