package eunjongDAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	// JDBC Driver 등록 & 연결
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@kosa402.iptime.org:50031:orcl", "younghun", "oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}