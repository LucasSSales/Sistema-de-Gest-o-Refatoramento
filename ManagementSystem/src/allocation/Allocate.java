package allocation;

import java.util.ArrayList;
import java.util.Scanner;

public class Allocate extends Allocation {
	
	public void Allocate(ArrayList<Allocation> alloc, int userType) {
		System.out.println("WHAT DO YOU WISH TO ALLOCATE?");
		
		
		Scanner scan = new Scanner(System.in);
		Scanner scanI = new Scanner(System.in);
		String s = scan.nextLine();
		
		Allocation toAlloc = null;

		for (Allocation al : alloc) {
			if(s.equals(al.getName())) {
				System.out.println("Allocation found");
				toAlloc = al;
				break;
			}
		}
		
		
		if(toAlloc == null) {
			System.out.println("Allocation not Found :(");
		}else{
			
			
	   		String[] sch = {"07h30 - 09h10", "09h20 - 11h00","11h10 - 12h50" ,"13h30 - 15h10","15h20 - 17h00","17h10 - 18h50"}; 
			
			
			System.out.println("Type the date (DD/MM)");
			toAlloc.setDate(scan.nextLine());
			String hr = null;
						
			
			for (String st : toAlloc.getSchedules()) {
				if(st.substring(0, 5).equals(toAlloc.getDate())) {
					hr = st.substring(10);
				}
			}
			
			
			boolean x = true;
			int op;
			do {
				System.out.println("Choose the schedule\n"+
						"1- 07h30 - 09h10\n" + 
						"2- 09h20 - 11h00\n" + 
						"3- 11h10 - 12h50\n" + 
						"4- 13h30 - 15h10\n" + 
						"5- 15h20 - 17h00\n" + 
						"6- 17h10 - 18h50");
				
				op = scanI.nextInt();
				
				if(hr != null) {
					if(!sch[op].equals(hr))
						x = false;
					else
						System.out.println("Already allocated, try again");
				}else {
					x = false;
				}
				
			}while(x);
			
			ArrayList<String> schedules = toAlloc.getSchedules();
			schedules.add(getDate() + " at " + sch[op]);
			
			toAlloc.setActivity(new Activity(userType));			
		}
		
		setaState(alocated());
		System.out.println("Allocation Concluded");
		
	}
	
	public Allocate(String name, String code) {
		super(name, code);
		// TODO Auto-generated constructor stub
	}
}
