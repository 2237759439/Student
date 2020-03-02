package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	private static Connection conn;
	// 获得连接的方法
	public static Connection getConnection() {
		try {
			// 加载jdbc驱动包
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student_git?UseUnicode=true&characterEncoding=UTF-8","root", "051231");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
