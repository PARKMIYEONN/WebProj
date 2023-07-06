//package aisw.web.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class ConnectionFactory {
//	
//	Connection conn;
//	String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	String user = "hr";
//	String password = "hr";
//	String driver = "oracle.jdbc.driver.OracleDriver";
//	
//	
//	public void setConn(Connection conn) {
//		this.conn = conn;
//	}
//
//
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//
//
//	public void setUser(String user) {
//		this.user = user;
//	}
//
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//
//	public void setDriver(String driver) {
//		this.driver = driver;
//	}
//	
//	org.springframework.jdbc.datasource.DriverManagerDataSource
//
//	public Connection getConnection() throws Exception {
//		
//			
//			Class.forName(driver);
//			
//			
//			conn = DriverManager.getConnection(url, user, password);
//			
//		
//		return conn;
//	}
//}
