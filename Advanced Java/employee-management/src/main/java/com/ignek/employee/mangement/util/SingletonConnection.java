package com.ignek.employee.mangement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.ignek.employee.mangement.constants.Constants;

public class SingletonConnection {

	private static SingletonConnection instance;

	private SingletonConnection() {
	}

	public static synchronized SingletonConnection getInstance() {

		if (instance == null) {
			instance = new SingletonConnection();
		}

		return instance;
	}

	public Connection getConnection() throws SQLException {
		try {

			Class.forName(Constants.DRIVER);
			Connection connection = DriverManager.getConnection(Constants.PATH, Constants.USERNAME, Constants.PASSWORD);
			return connection;

		} catch (ClassNotFoundException classNotFoundException) {
			throw new ClassCastException(Constants.DRIVER + " not found...");

		} catch (SQLException sqlException) {
			throw new SQLException("Connection not established...");
		}
	}
}
