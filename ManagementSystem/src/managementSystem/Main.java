package managementSystem;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Scanner;
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
					ArrayList<Allocation> a = u.getAllocations();
					if(a!=null) {
						for (Allocation s : a) {
							Allocation confirm = s;
							if(confirm.getDate().substring(0, 5).equals(aux.currentDate()) && !confirm.getaState().equals("In Progress")) {
								System.out.println("You have an allocation marked for today, want confirm?"
										+ "\n" + confirm.getName()
										+ "\n\t1- YES/0- NO");
								option = scan.nextInt();
								allocate.confirmAllocation(option, confirm);
								if(option==0) {
									allocate.delete(a, a.indexOf(confirm));
								}
								break;
							}
						}
					}
					u.setAllocations(u.add(u.getAllocations(), allocate.Allocate(cAlloc.getA(), u)));
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
