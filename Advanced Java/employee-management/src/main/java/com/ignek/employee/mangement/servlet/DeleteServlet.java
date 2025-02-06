package com.ignek.employee.mangement.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ignek.employee.mangement.util.SingletonConnection;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = -3947616843704077937L;
	private static final Logger LOGGER = Logger.getLogger(DeleteServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session.getAttribute("id") == null) {
			response.sendRedirect("LoginServlet");
			return;
		}

		int id = (int) session.getAttribute("id");

		try {
			Connection connection = SingletonConnection.getInstance().getConnection();

			String query = "delete from employee where id=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);

			statement.executeUpdate();

			session.removeAttribute("id");
			session.invalidate();

			LOGGER.info("User Deleted");
			response.sendRedirect("LoginServlet");

		} catch (SQLException sqlException) {
			LOGGER.error("SQLException occred:" + sqlException.getMessage());
		}
	}
}
