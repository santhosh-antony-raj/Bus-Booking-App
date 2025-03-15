package com.busreservation.br;

import java.sql.*;

public class DbConnection {
	private static final String url="jdbc:mysql://localhost:3306?";
	private static final String user = "root";
	private static final String password = "admin";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
//				public static void main(String[] args) {
//					Connection conn = null;
//					Statement stmt = null;
//					ResultSet rs = null;
//					String qry = "select * from busapp.bus";
//					String url ="jdbc:mysql://localhost:3306?";
//					String user = "root";
//					String password = "admin";
//					
//					try {
//						Class.forName("com.mysql.jdbc.Driver");
//						System.out.println("Connection Loaded Sucessfully");
//						conn = DriverManager.getConnection(url, user, password);
//						System.out.println("Connection established successfully");
//						stmt = conn.createStatement();
//						rs = stmt.executeQuery(qry);
//						System.out.println("query executed!!!");
//						
//						while(rs.next()) {
//							System.out.println("busno : "+ rs.getInt(1)+"Capacity : "+rs.getInt(2)+" Ac : "+rs.getBoolean(3));
//						}
//						
//						
//					} catch (ClassNotFoundException | SQLException e) {
//						e.printStackTrace();
//					}
//					if(conn!=null) {
//						try {
//							conn.close();
//						} catch (SQLException e) {
//							
//							e.printStackTrace();
//						}
//					}
//				}
	
}
