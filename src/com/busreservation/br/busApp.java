package com.busreservation.br;

import java.sql.SQLException;
import java.util.Scanner;

public class busApp {

	public static void main(String[] args) throws SQLException {
		busDAO bda = new busDAO();
		bda.displayInfo();
		int addbus=1;
		while(addbus==1) {
			System.out.println("want to addbus 1 to exit 2");
			Scanner sc= new Scanner(System.in);
			addbus=sc.nextInt();
			if(addbus==1) {
				bda.addbus();
				bda.displayInfo();
			}else {
				System.out.println("OK Bye!!!");
			}
		}
		
		int userinput = 1;
		while(userinput==1) {
			System.out.println("Enter 1 to booking and 2 to exist");
			Scanner ip = new Scanner(System.in);
			userinput = ip.nextInt();
			if(userinput==1) {
				System.out.println("Booking Begins");
				System.out.println("Welcome Sir/Mam");
				booking Book = new booking();
				bookingDAO booda = new bookingDAO();
				if(Book.isAvailable()) {
					bookingDAO bdao = new bookingDAO();
					bdao.addBooking(Book);
					System.out.println("Booking is Confirmed");
					booda.displayInfo();
					
				}else {
					System.out.println("Bus full try another date or bus");
				}
				
			}else {
				System.out.println("Thankyou for choosing us :)");
			}
		}
	}

}
