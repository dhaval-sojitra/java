package com.ignek.employee.mangement.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ignek.employee.mangement.util.SingletonConnection;

@WebServlet(urlPatterns = { "/LoginServlet", "/" })
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -8998503265929782366L;
	private static final Logger LOGGER = Logger.getLogger(LoginServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session.getAttribute("id") != null) {
			response.sendRedirect("ProfileServlet");
			return;
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(request, response);
			return;
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			Connection connection = SingletonConnection.getInstance().getConnection();

			String selectQuery = "select id from employee where email=? and password=?";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setString(1, email);
			statement.setString(2, password);

			ResultSet data = statement.executeQuery();

			if (data.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("id", data.getInt(1));

				response.sendRedirect("ProfileServlet");
				LOGGER.info("Login Successfully...");
			} else {
				request.setAttribute("loginError", "Incorrect email or password");
				request.setAttribute("email", email);

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
				requestDispatcher.forward(request, response);
				LOGGER.warn("Login failed...");
			}
		} catch (SQLException sqlException) {
			LOGGER.error("SQLError occred:" + sqlException.getMessage());
		}
	}
}
