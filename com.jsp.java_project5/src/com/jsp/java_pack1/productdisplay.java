package com.jsp.java_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class productdisplay {

	public static void main(String[] args) {

		try {
			// step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/productdata";
			String username = "root";
			String password = "Vishesh@123";
			Connection connection = DriverManager.getConnection(url, username, password);

			// step-3 create statement
			Statement statement = connection.createStatement();
			// step-4 execute query
			String select = "select * FROM newproduct";
			ResultSet set = statement.executeQuery(select);
			System.out.println("========welcome to product database=========");
			System.out.println("productId    price       discount      warrantycode         batchcode");
			while (set.next()) {
				int productId = set.getInt("productId");
				int price = set.getInt("price");
				double discount = set.getDouble("discount");
				long warrantycode = set.getLong("warrantycode");
				int batchcode = set.getInt("batchcode");
				System.out.print(productId + "      ");
				System.out.print(price + "        ");
				System.out.print(discount + "          ");
				System.out.print(warrantycode + "         ");
				System.out.print(batchcode);
				System.out.println();
			}
			System.out.println("=========================================================End of page....");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
