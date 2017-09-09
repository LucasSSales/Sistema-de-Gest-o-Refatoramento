package managementSystem;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Scanner;

import ProtectionProxy.ActivityProxy;
import users.*;
import allocation.Allocate;
import allocation.Allocation;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("WELLCOME!");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanS = new Scanner(System.in);
		int option;
		String text;
		Allocate allocate = new Allocate();
		Consult cUsers = new Consult();
		Consult cAlloc = new Consult();
		Relatory r = new Relatory();
		Auxiliar aux = new Auxiliar();
		
		cUsers.setA(cUsers.add(cUsers.getA(), new Adm("Adimino da Silva", 21)));
				
		cAlloc.setA(cAlloc.add(cAlloc.getA(), new Allocation("Projector1", "PRJ001")));		
		cAlloc.add(cAlloc.getA(), new Allocation("Projector2", "PRJ002"));
		cAlloc.add(cAlloc.getA(), new Allocation("Room1", "RM001"));
		cAlloc.add(cAlloc.getA(), new Allocation("Room2", "RM002"));
		cAlloc.add(cAlloc.getA(), new Allocation("Auditorium", "ADT001"));		 
		cAlloc.add(cAlloc.getA(), new Allocation("Laboratory1", "LB001"));
		cAlloc.add(cAlloc.getA(), new Allocation("Laboratory2", "LB002"));
		
		
		System.out.println("WHAT DO YOU WISH TO DO?");
		do {
			System.out.println("1- Register"
					+ "\n2- Allocate"
					+ "\n3- Consult"
					+ "\n4- Get Relatory"
					+ "\n0- EXIT");
			
			option = scan.nextInt();
//////////////////////////////////////////////////////////////////////////////////////////
			if(option==1) {
				System.out.println("What kind of user are you?\n"
						+ "1- Student\n"
						+ "2- Reseacher\n"
						+ "3- Professor");
				option = scan.nextInt();
				if(option == 1)
					cUsers.setA(cUsers.add(cUsers.getA(), new Student(r.getNumUsers()+1)));
				else if(option == 2)
					cUsers.setA(cUsers.add(cUsers.getA(), new Researcher(r.getNumUsers()+1)));
				else if(option == 3)
					cUsers.setA(cUsers.add(cUsers.getA(), new Professor(r.getNumUsers()+1)));
				r.setNumUsers(r.getNumUsers()+1);
//////////////////////////////////////////////////////////////////////////////////////////
			}else if(option==2) {
				System.out.println("Type your name or ID");
				
				User u = (User) cUsers.search(cUsers.getA(), scanS.nextLine());
				
				if(u!=null) {
					System.out.println("What do you want to do?\n"
							+ "1- Do allocation\n"
							+ "2- Comfirm Allocation\n"
							+ "3- Change Status");
					option = scan.nextInt();
					if(option==1) {
						allocate.Allocate(cAlloc.getA(), u);
						System.out.println(u.getAllocations());
					}else if (option==2) {
						allocate.confirmAllocation(u, cAlloc);					
					}else if(option == 3) {
						ActivityProxy ap = new ActivityProxy(u);
						if(ap.admAcess()) {
							System.out.println("1-Concluded\n2-Reset");
							option = scan.nextInt();
							if(option==1)
								allocate.setConcluded(cAlloc);
							else
								allocate.backToInProcess(cAlloc);
						}else
							System.out.println("You can't acess this option!");
					}
				}else
					System.out.println("You are not registered, so you can't allocate");
//////////////////////////////////////////////////////////////////////////////////////////
			}else if(option == 3) {
				System.out.println("What do you want to consult?\n"
						+ "1- User\n"
						+ "2- Allocation");
				
				option = scan.nextInt();
				Object show = null;
				
				if(option == 1) {
					System.out.println("Type the name or the ID");
					show = cUsers.search(cUsers.getA(), scanS.nextLine());
				}else if(option == 2) {
					System.out.println("Type the name or the code");
					show = cAlloc.search(cAlloc.getA(), scanS.nextLine());
				}
				
				if(show == null)
					System.out.println("\nNOT FOUND\n");
				else
					System.out.println("\n"+show+"\n");
//////////////////////////////////////////////////////////////////////////////////////////
			}else if(option==4) {
				System.out.println("Number of Users: " + r.getNumUsers());
				System.out.println("Number of Allocations: "+ r.getNumAlloc()+"\n");

				r.getRelatory(cAlloc.getA());
				System.out.println("");
			}
			
			if(option!=0)
				System.out.println("WANT REALIZE ANOTHER OPERATION?\n\t1 - YES/0 - NO");
				option = scan.nextInt();
			
		}while(option!=0);
		System.out.println("THE PROCESS WAS FINISHED");
	}
}
