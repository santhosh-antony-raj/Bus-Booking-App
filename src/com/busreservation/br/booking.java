package com.busreservation.br;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class booking {
			int busNo;
			String passName;
			Date date;
			
			booking(){
				Scanner ip = new Scanner(System.in);
				System.out.println("Enter Passage name");
				this.passName=ip.next();
				System.out.println("BusNo");
				this.busNo=ip.nextInt();
				System.out.println("Enter the date");
				String sdate = ip.next();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
				try {
					date = dateformat.parse(sdate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			public boolean isAvailable() throws SQLException {
				busDAO busdao = new busDAO();
				bookingDAO boodao = new bookingDAO();
				int capacity = busdao.getCapacity(busNo);
				int booked= boodao.getBookedCount(busNo, date);
				return booked<capacity?true:false;
			}
			
}
