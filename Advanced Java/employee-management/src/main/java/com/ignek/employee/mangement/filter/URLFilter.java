package com.ignek.employee.mangement.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = { "/*" }, filterName = "/UrlFilter")
public class URLFilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = -4495002233962832210L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest servletRequset = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;

		HttpSession session = servletRequset.getSession(false);

		if (session == null) {
			RequestDispatcher requestDispatcher = servletRequset.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(servletRequset, servletResponse);
			return;
		} else {
			if (servletRequset.getRequestURI().endsWith("jsp")) {
				servletResponse.sendRedirect("LoginServlet");
			} else {
				chain.doFilter(request, response);
			}
		}
	}
}
