package com.ignek.employee.mangement.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 8123853720472641497L;
	private static final Logger LOGGER = Logger.getLogger(UserDataServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		session.removeAttribute("id");
		session.invalidate();

		LOGGER.info("User loggedout");
		response.sendRedirect("LoginServlet");
	}
}
