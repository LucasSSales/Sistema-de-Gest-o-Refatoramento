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
		Consult cUsers = new Consult();
		Consult cAlloc = new Consult();
		Relatory r = new Relatory();
				
		//Adm ADM = new Adm("Adimino Silva", 23);
		//cUsers.add(ADM);
		
		cAlloc.add(new Allocation("Projector1", "PRJ001"));
		cAlloc.add(new Allocation("Projector2", "PRJ002"));
		cAlloc.add(new Allocation("Room1", "RM001"));
		cAlloc.add(new Allocation("Room2", "RM002"));
		cAlloc.add(new Allocation("Auditorium", "ADT001"));		 
		
		
		System.out.println("WHAT DO YOU WISH TO DO?");
		do {
			System.out.println("1- Register"
					+ "\n2- Allocate"
					+ "\n3- Consult"
					+ "\n4- Get Relatory"
					+ "\n0- EXIT");
			
			option = scan.nextInt();
			
			if(option==1) {
				//cUser.add(new User());
			}else if(option==2) {
				//cAlloc.add(new Allocation())
			}else if(option == 3) {
				System.out.println("What do you want to consult?\n"
						+ "1- User\n"
						+ "2- Allocation");
				//cUsers.doConsult(); //if option==1
				//cAlloc.doConsult(); //if option==2
			}else if(option==4) {
				System.out.println("Number of Users: " + r.getNumUsers());
				System.out.println("Number of Allocations: "+ r.getNumAlloc()+"\n");
				//r.getRelatory(cUsers.getA);
				r.getRelatory(cAlloc.getA());
			}
			
			if(option!=0)
				System.out.println("WANT REALIZE ANOTHER OPERATION?\n\t1 - YES/0 - NO");
				option = scan.nextInt();
			
		}while(option!=0);
		System.out.println("THE PROCESS WAS FINISHED");
		
	}
}
