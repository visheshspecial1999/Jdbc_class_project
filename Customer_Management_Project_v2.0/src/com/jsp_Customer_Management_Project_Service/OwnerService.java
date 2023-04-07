package com.jsp_Customer_Management_Project_Service;

import java.util.List;
import java.util.Scanner;

import com.jsp_Customer_Management_Project.Admin;
import com.jsp_Customer_Management_Project_Dao.OwnerDao;

public class OwnerService {

	OwnerDao dao = new OwnerDao();
	// ownerLogin method
	public void ownerLogin(int ownerId, String OwnerPassword, int OwnerPasscode) {

		Scanner s = new Scanner(System.in);
		if ((dao.ownerId(ownerId) == dao.ownerPassword(OwnerPassword)) && (dao.ownerId(ownerId) == OwnerPasscode)) {
			System.out.println("Login successfull.....");
			while (true) {
				System.out.println("1.InsertAdmin\n2.Update Admin with name and email\n3.Delete Admin\n4.Exit");
				System.out.print("Enter your choice: ");
				int choice = s.nextInt();
				switch (choice) {
				case 1: {
					Admin admin = new Admin();
					System.out.print("Enter Admin id: ");
					int adminId = s.nextInt();
					admin.setAdminId(adminId);
					System.out.print("Enter Admin Name (Not more than 8 characters including space): ");
					String adminName = s.next();
					adminName += s.nextLine();
					admin.setAdminName(adminName);
					System.out.print("Enter Admin Email: ");
					String adminEmail = s.next();
					adminEmail += s.nextLine();
					admin.setAdminEmail(adminEmail);
					// creating reference for service method to stablish the connection.
					AdminService adminService = new AdminService();
					adminService.insertAdmin(admin);
					// creating reference for service method to stablish the connection.
				}
					break;
				case 2: {
					System.out.print("Enter adminId: ");
					int adminId = s.nextInt();
					System.out.print("Enter admin name: ");
					String adminName = s.next();
					adminName += s.nextLine();
					System.out.print("Enter admin email: ");
					String adminEmail = s.nextLine();
					// creating reference for service method to stablish the connection.
					AdminService adminService = new AdminService();
					adminService.updateAdmin(adminId, adminName, adminEmail);
				}
					break;
				case 3: {
					System.out.print("Enter adminId: ");
					int adminId = s.nextInt();
					AdminService adminService = new AdminService();
					adminService.deleteAdmin(adminId);
				}
					break;
				case 4: {
					System.out.println("System.............closed");
					System.exit(choice);
				}

				default: {
					System.out.println("invalid choice");
				}
				}
			}
		} else {
			System.out.println("invalid creditial please try again!!!");
		}
	}
	
	// displayOwners method
		public void displayOwners() {
			 dao.displayOwners();
		}
}