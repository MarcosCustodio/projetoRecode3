package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	private static final String url = "jdbc:mysql://localhost:3306/spacetur";
	private static final String user = "root";
	private static final String password = "Golfinho3306!";

	public static Connection createConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Encontrado!");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {

			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado!");
			return connection;

		} catch (SQLException e) {

			System.out.println("Não conectado ao banco de dados" + e.getMessage());
			return null;
		}

	}

}
