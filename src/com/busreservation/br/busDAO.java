package com.busreservation.br;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class busDAO  {
	public void displayInfo() throws SQLException {
		String qry ="select * from busapp.bus";
   Connection conn = DbConnection.getConnection();
   Statement stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(qry);
   
   while(rs.next()) {
	   System.out.println("busno : "+ rs.getInt(1)+" Capacity : "+rs.getInt(2)+" Ac : "+rs.getBoolean(3));
   }
   
}
	public void addbus() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter busno:");
		int abusno= sc.nextInt();
		System.out.println("enter capacity:");
		int acapacity= sc.nextInt();
		System.out.println("enter Ac");
		boolean aAc = sc.hasNextBoolean();
	String add ="insert into busapp.bus values(?,?,?)";
   Connection conn = DbConnection.getConnection();
   java.sql.PreparedStatement pstmt = conn.prepareStatement(add);
   pstmt.setInt(1, abusno);
   pstmt.setInt(2, acapacity);
   pstmt.setBoolean(3, aAc);
   pstmt.executeUpdate();
   
   
  
   
}
	public int getCapacity(int busno) throws SQLException {
		String qry = "select * from busapp.bus where busNo =" + busno;
		Connection conn =DbConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(qry);
		rs.next();
		return rs.getInt(2) ;
	}
}
