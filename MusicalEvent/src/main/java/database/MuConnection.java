package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MuConnection {

	public static String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	public static String DB_URL="jdbc:mysql://localhost:3306/music";
	public static String DB_USERNAME="root";
	public static String DB_PASSWORD="Vinaya123";
	public  static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName(DB_DRIVER);
			conn=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			if(conn!=null) {
				System.out.println("Table Created");
			}
			else {
				System.out.println("Failed to connect");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String args[]) {
		
	}


}
