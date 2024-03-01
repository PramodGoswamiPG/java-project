package serviceImpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

import dao.HotelRepo;
import entity.Address;
import entity.Customer;
import service.HotelService;

public class HotelServiceImpl implements HotelService, HotelRepo {
	Scanner sc = new Scanner(System.in);

//	blocks to create rooms
	{
		for (int i = 1; i <= 10; i++) {
			cm.put(i, null);
		}

		for (int i = 1; i <= 8; i++) {
			sm.put(i, null);
		}
		for (int i = 1; i <= 5; i++) {
			dm.put(i, null);
		}

	}

	public void roomInfo() {
		System.out.println("==========Classics Rooms=======");
		System.out.println("Hot water:Yes");
		System.out.println("Ac:No");
		System.out.println("Tv:No");
		System.out.println("Wifi:No");
		System.out.println("Price:3000");
		System.out.println("==========Standard Rooms=======");
		System.out.println("Hot water:Yes");
		System.out.println("Ac:No");
		System.out.println("Tv:Yes");
		System.out.println("Wifi:No");
		System.out.println("Price:4000");
		System.out.println("==========Deluxe Rooms=======");
		System.out.println("Hot water:Yes");
		System.out.println("Ac:Yes");
		System.out.println("Tv:Yes");
		System.out.println("Wifi:Yes");
		System.out.println("Price:5000");
	}

	public void CheckRoom(LinkedHashMap<Integer, Customer> l1) {
		boolean flag = false;
		for (Integer ele : l1.keySet()) {
			if (l1.get(ele) == null) {
				System.out.println(ele + " ");
				flag = true;
			}
		}
		System.out.println();
		if (flag == false)
			System.out.println("No Rooms Are Available");
	}

	@Override
	public void availableRoom() {
		// TODO Auto-generated method stub
		System.out.println("========Available Rooms======");
		System.out.println("========Classic Rooms======");
		CheckRoom(cm);
		System.out.println("========Standard Rooms======");
		CheckRoom(sm);
		System.out.println("========Deluxe Rooms======");
		CheckRoom(dm);

	}

	Customer createCustomer() {
		System.out.println("Enter Customer Details");
		System.out.println("Enter Customer id");
		int cid = sc.nextInt();
		System.out.println("Enter Customer name");
		String cname = sc.next();
		System.out.println("Enter Customer age");
		int cage = sc.nextInt();
		System.out.println("Enter Custome phno:");
		long cphno = sc.nextLong();
		System.out.println("Enter Customer Email");
		String cemail = sc.next();
		System.out.println("Enter Customer pan");
		int cpan = sc.nextInt();
		System.out.println("Enter Customer doorno");
		int doorno = sc.nextInt();
		System.out.println();
		System.out.println("Enter Customer Street");
		String Street = sc.next();
		System.out.println("Enter Customer dist");
		String dist = sc.next();
		System.out.println("Enter Customer State");
		String State = sc.next();
		System.out.println("Enter Customer country");
		String country = sc.next();
		System.out.println("Enter Customer pincode");
		int pincode = sc.nextInt();
		Address a1 = new Address(dist, Street, doorno, State, country, pincode);
		return new Customer(cname, cid, cphno, cemail, a1, cpan);

	}

	void mapRoom(LinkedHashMap<Integer, Customer> l1, int roomNo, double amt) {
		if (l1.get(roomNo) == null) {
			Customer c = createCustomer();
			a1.add(c);
			l1.put(roomNo, c);
			c.setCamt(amt);
			System.out.println("Room no: " + roomNo + "  had been allocated for  " + c.getCname());
			System.out.println("===================================");
		} else {
			System.out.println("Room is not Available!!!");
		}
	}

	void unmapRoom(LinkedHashMap<Integer, Customer> l1, int roomno) {

		if (l1.get(roomno) != null) {
			Customer c1 = l1.get(roomno);
			System.out.println(c1);
			System.out.println(c1.getCname() + "need to pay" + c1.getCamt() + "rs");
			l1.put(roomno, null);
		}
	}

	@Override
	public void allocateRoom() {
		// TODO Auto-generated method stub

		System.out.println("======Menu=======");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room.");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("Enter the room no:");
			int roomNo1 = sc.nextInt();
			if (roomNo1 >= 1 && roomNo1 <= 10) {
				mapRoom(cm, roomNo1, 3000.00);
			} else {
				System.out.println("Enter correct RoomNo");
			}
			break;
		case 2:
			System.out.println("Enter the room no:");
			int roomNo2 = sc.nextInt();
			if (roomNo2 >= 1 && roomNo2 <= 8) {
				mapRoom(sm, roomNo2, 4000.00);
			} else {
				System.out.println("Enter correct RoomNo");
			}
			break;
		case 3:
			System.out.println("Enter the room no:");
			int roomNo3 = sc.nextInt();
			if (roomNo3 >= 1 && roomNo3 <= 5) {
				mapRoom(dm, roomNo3, 5000.00);
			} else {
				System.out.println("Enter correct RoomNo");
			}
			break;
		default:
			System.out.println("Invalid Option!!!");

		}
	}

	@Override
	public void checkout() {

		System.out.println("======Menu=======");
		System.out.println("1.Classic Room\n2Standard Room\n3.Deluxe Room.");
		int op = sc.nextInt();
		System.out.println("Enter the room no");
		int roomno = sc.nextInt();
		switch (op) {
		case 1:
			if (roomno >= 1 && roomno <= 10) {
				unmapRoom(cm, roomno);
			} else {
				System.out.println("invalid room no");
			}

		case 2:
			if (roomno >= 1 && roomno <= 10) {
				unmapRoom(cm, roomno);
			} else {
				System.out.println("invalid room no");
			}

		case 3:
			if (roomno >= 1 && roomno <= 10) {
				unmapRoom(cm, roomno);
			} else {
				System.out.println("invalid room no");
			}
			break;

		default:
			break;
		}
	}

	@Override
	public void FindAllCustomer() {
		if (a1.size() == 0) {
			System.out.println("data base is empty..!!!");
		} else {
			for (Customer ele : a1) {
				System.out.println(ele);
			}
		}

	}

	@Override
	public void getCustomerByid() {
		boolean flag = false;
		System.out.println("enter the customer id:-");
		int cid = sc.nextInt();
		for (Customer ele : a1) {
			if (ele.getCid() == cid) {
				System.out.println(ele);
				flag = true;
				break;
			}
		}

	}

}
