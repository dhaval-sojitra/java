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

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

	private static final long serialVersionUID = -6904854220512476625L;
	private static final Logger LOGGER = Logger.getLogger(UserDataServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session.getAttribute("id") == null || session.getAttribute("id").equals(null)) {
			response.sendRedirect("LoginServlet");
			return;
		}

		int id = (int) session.getAttribute("id");

		try {
			Connection connection = SingletonConnection.getInstance().getConnection();

			String query = "select * from employee where id=? ";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);

			ResultSet data = statement.executeQuery();

			if (data.next()) {
				request.setAttribute("email", data.getString(3));
				request.setAttribute("name", data.getString(2));
				request.setAttribute("phone", data.getString(4));
				request.setAttribute("birthdate", data.getString(5));
				request.setAttribute("address", data.getString(6));

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (SQLException sqlException) {
			LOGGER.error("SQLError occred:" + sqlException.getMessage());
		}
	}
}
