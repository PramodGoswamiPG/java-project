package app;

import java.util.Scanner;

import service.HotelService;
import serviceImpl.HotelServiceImpl;

public class HotelApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HotelService h1 = new HotelServiceImpl();
		System.out.println("=======Welcome To  Hotel Management System========");
		while (true) {
			System.out.println("=====Menu=====");
			System.out.println(
					"1.Room Details\n2.Available Rooms \n3.Allocate Room \n4.Deallocate Room\n5.Find All Customer\n6.Find customer by id\n7.Exit");
			System.out.println("Enter your Option:");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				h1.roomInfo();
				break;
			case 2:
				h1.availableRoom();
				break;
			case 3:
				h1.allocateRoom();
				break;
			case 4:
				h1.checkout();
				break;
			case 5:
				h1.FindAllCustomer();
				;
				break;
			case 6:
				h1.getCustomerByid();
				break;
			case 7:
				System.out.println("===Thank you visit again===");
				System.exit(0);
			}

		}

	}

}
