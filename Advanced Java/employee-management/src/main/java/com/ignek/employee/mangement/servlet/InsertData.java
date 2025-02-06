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
import com.ignek.employee.mangement.util.Validation;

@WebServlet("/InsertData")
public class InsertData extends HttpServlet {

	private static final long serialVersionUID = 416048812380471676L;
	private static final Logger LOGGER = Logger.getLogger(InsertData.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameterMap().containsKey("formtype")) {

			if (request.getParameter("formtype").equals("registration")) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("registration.jsp");
				requestDispatcher.forward(request, response);

			} else {
				response.sendRedirect("LoginServlet");
			}

		} else {
			HttpSession session = request.getSession(false);

			if (session.getAttribute("id") != null) {
				response.sendRedirect("ProfileServlet");
			} else {
				response.sendRedirect("LoginServlet");
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String formType = request.getParameter("formtype");

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String birthdate = request.getParameter("dateofbirth");
		String address = request.getParameter("address");
		String password = request.getParameter("password");

		request.setAttribute("email", email);
		request.setAttribute("name", name);
		request.setAttribute("phone", phone);
		request.setAttribute("birthdate", birthdate);
		request.setAttribute("address", address);

		int errorCount = 0;
		if (Validation.checkNull(name) || Validation.checkNull(email) || Validation.checkNull(phone)
				|| Validation.checkNull(birthdate) || Validation.checkNull(address) || Validation.checkEmail(email)
				|| Validation.checkPhone(phone) || Validation.checkBirthdate(birthdate)) {
			errorCount++;
		}

		if (formType.equals("registration")) {
			if (Validation.checkNull(password) || Validation.checkPassword(password)) {
				errorCount++;
			}
		}

		if (errorCount != 0) {
			request.setAttribute("nullError", "*Enter proper deatils");
			LOGGER.warn("Null value not allowed");

			if (formType.equals("update")) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
				requestDispatcher.forward(request, response);
				return;
			}
			if (formType.equals("registration")) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("registration.jsp");
				requestDispatcher.forward(request, response);
				return;
			}
		}

		try {
			Connection connection = SingletonConnection.getInstance().getConnection();

			String selectQuery = "select * from employee where email=?";

			PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
			selectStatement.setString(1, email);

			ResultSet data = selectStatement.executeQuery();

			HttpSession session = request.getSession(false);

			if (data.next()) {
				if (formType.equals("update")) {
					int id = (int) session.getAttribute("id");

					if (data.getInt("id") != id) {
						LOGGER.warn("Employee already registered with this email:" + email);
						request.setAttribute("emailError", "*Employee already registered with this email:" + email);

						RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
						requestDispatcher.forward(request, response);
						return;
					}
				}
				if (formType.equals("registration")) {
					LOGGER.warn("Employee already registered with this email:" + email);
					request.setAttribute("emailError", "*Employee already registered with this email:" + email);

					RequestDispatcher requestDispatcher = request.getRequestDispatcher("registration.jsp");
					requestDispatcher.forward(request, response);
					return;
				}
			}
			if (formType.equals("update")) {
				int id = (int) session.getAttribute("id");

				String updateQuery = "update employee set name=? ,email=? ,phone=? ,birthdate=?,address=? where id=?";

				PreparedStatement statement = connection.prepareStatement(updateQuery);
				statement.setString(1, name);
				statement.setString(2, email);
				statement.setString(3, phone);
				statement.setString(4, birthdate);
				statement.setString(5, address);
				statement.setInt(6, id);

				statement.executeUpdate();

				LOGGER.info("Data Updated");
				response.sendRedirect("ProfileServlet");

			} else if (formType.equals("registration")) {
				String insertQuery = "insert into employee(name,email,phone,birthdate,address,password) values (?,?,?,?,?,?)";

				PreparedStatement statement = connection.prepareStatement(insertQuery);
				statement.setString(1, name);
				statement.setString(2, email);
				statement.setString(3, phone);
				statement.setString(4, birthdate);
				statement.setString(5, address);
				statement.setString(6, password);

				statement.executeUpdate();

				LOGGER.info("Registration Suceess...");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("LoginServlet");
				requestDispatcher.forward(request, response);
				return;

			} else {

				if (session.getAttribute("id") != null) {
					response.sendRedirect("ProfileServlet");
				} else {
					response.sendRedirect("LoginServlet");
				}
			}
		} catch (SQLException sqlException) {
			LOGGER.error("SQLError ocured: " + sqlException.getMessage());
		}
	}
}
