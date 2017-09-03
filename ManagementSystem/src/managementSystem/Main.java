package managementSystem;
import java.util.Scanner;
import users.*;

import allocation.Allocation;
import users.User;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("WELLCOME!");
		Scanner scan = new Scanner(System.in);
		int option;
		Consult c = null;
		
		System.out.println("WHAT DO YOU WISH TO DO?");
		do {
			System.out.println("1- Register"
					+ "\n2- Allocate"
					+ "\n3- Consult"
					+ "\n4- Get Relatory"
					+ "\n0- EXIT");
			
			option = scan.nextInt();
			
			if(option==1) {
				//c.addUser(new User());
			}else if(option==2) {
				
			}else if(option == 3) {
				
			}else if(option==4) {
				
			}
			
			if(option!=0)
				System.out.println("WANT REALIZE ANOTHER OPERATION?\n\t1 - YES/0 - NO");
			
		}while(option!=0);
		System.out.println("THE PROCESS WAS FINISHED");
		
	}
}
