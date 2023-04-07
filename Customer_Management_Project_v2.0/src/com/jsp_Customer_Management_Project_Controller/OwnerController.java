package com.jsp_Customer_Management_Project_Controller;

import java.util.List;
import java.util.Scanner;

import com.jsp_Customer_Management_Project_Service.OwnerService;

public class OwnerController {

	public static void main(String[] args) {
//		while(true)
		{
			Scanner s = new Scanner(System.in);
			OwnerService service = new OwnerService();
			System.out
					.println("==========================welcome to owner window=====================================");
			System.out.println("1.Login\n2.show owners\n3.Exit");
			System.out.print("enter your choice: ");
			int choice = s.nextInt();
			switch (choice) {
			case 1: {

				System.out.print("enter ownerId: ");
				int ownerId = s.nextInt();
				System.out.print("enter ownerPassword: ");
				String ownerPassword = s.next();
				System.out.println("enter ownerPasscode: ");
				int ownerPasscode = s.nextInt();
				service.ownerLogin(ownerId, ownerPassword, ownerPasscode);
			}
				break;

			case 2: {
				service.displayOwners();
			}
				break;
			case 3: {
				System.out.println("system closed");
				System.exit(choice);
			}
				break;
			default: {
				System.out.println("invalid choice!!!");
			}

			}

		}

	}

}
