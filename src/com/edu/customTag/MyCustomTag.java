package com.edu.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport {
	int cnt = 1;

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("�����±׸� �������ϴ�.");
		System.out.println("color �Ӽ� �� : " + color);
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doAfterBody() throws JspException {
		System.out.println("body ó���� �������ϴ�. : " + cnt);
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println("���±׸� �������ϴ�.");
		return EVAL_PAGE;
	}

}
