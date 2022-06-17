package by.sobol.hotel.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

//import org.apache.log4j.Logger;

public final class DBConnectionHelper {

	//private static final Logger LOG = Logger.getLogger(DBConnectionHelper.class);
	private static final String DB_CONNECT_PROPERTY = "db_config";

	private DBConnectionHelper() {
	}

	public static Connection connect() {

		Connection connection = null;
		try {
			ResourceBundle rb = ResourceBundle.getBundle(DB_CONNECT_PROPERTY);

			String url = rb.getString("db.url");
			String login = rb.getString("db.login");
			String pass = rb.getString("db.pass");

			Class.forName(rb.getString("db.driver"));
			connection = DriverManager.getConnection(url, login, pass);

		} catch (SQLException | ClassNotFoundException e) {
			//LOG.fatal("Couldn't establish the connection with the db: " + e.getMessage());

		}
		return connection;
	}

	public static void disconnect(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				//		LOG.warn("Can't close connection: " + e.getMessage());
			}
		}
	}
}