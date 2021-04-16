package com.hcl.training;

import java.sql.*;

public class StudentDetails {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/student";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM Details";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int rollNo = rs.getInt("rollNo");

				// Display values
				System.out.println("Student's Details:");
				System.out.println("First Name: " + firstName);
				System.out.println("Last Name: " + lastName);
				System.out.println("Roll No: " + rollNo);

			}

			// Crating PreparedStatement object
			PreparedStatement preparedStatement = conn.prepareStatement("insert into Details values(?,?,?)");
			// Setting values for Each Parameter
			preparedStatement.setString(1, "Saai");
			preparedStatement.setString(2, "M");
			preparedStatement.setInt(3, 49);

			// Executing Query
			preparedStatement.executeUpdate();
			System.out.println("Data Inserted successfully");

			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
	}// end main
}// end FirstExample
