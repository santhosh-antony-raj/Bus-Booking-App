package com.busreservation.br;

import java.util.Date;
import java.sql.*;

import com.mysql.jdbc.PreparedStatement;

public class bookingDAO {
	public int getBookedCount(int busNo,Date date) throws SQLException {
		String qry = "select count(passName) from busapp.booking where busNo=? and date=?";
		Connection conn = DbConnection.getConnection();
		java.sql.PreparedStatement pstmt = conn.prepareStatement(qry);
		java.sql.Date sqldate = new java.sql.Date(date.getTime()); 
		pstmt.setInt(1,busNo);
		pstmt.setDate(2,sqldate);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	public void addBooking(booking booking) throws SQLException{
		String qry = "insert into busapp.booking values(?,?,?)";
		Connection conn = DbConnection.getConnection();
		java.sql.PreparedStatement pstmt = conn.prepareStatement(qry);
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		pstmt.setString(1, booking.passName);
		pstmt.setInt(2,booking.busNo);
		pstmt.setDate(3, sqldate);
		pstmt.executeUpdate();
	}
	public void displayInfo() throws SQLException {
		String qry ="select * from busapp.booking";
   Connection conn = DbConnection.getConnection();
   Statement stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(qry);
   
   while(rs.next()) {
	   System.out.println("passName : "+ rs.getString(1)+" busNo : "+rs.getInt(2)+" Date : "+rs.getDate(3));
   }
   
}
}
