package allocation;

import java.util.ArrayList;
import java.util.Scanner;

import Strategy.Strategy;

public class Allocate extends Strategy{
	
	public void Allocate(ArrayList<Allocation> alloc, int userType) {
		System.out.println("WHAT DO YOU WISH TO ALLOCATE?\n(Type the name or the code)");
		
		
		Scanner scan = new Scanner(System.in);
		Scanner scanI = new Scanner(System.in);
		String s = scan.nextLine();
		
		Allocation toAlloc = null;

		for (Allocation al : alloc) {
			if(s.equals(al.getName()) || s.equals(al.getCode())) {
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
			String date = scan.nextLine();
			String hr = null;
						
			if(toAlloc.getSchedules() != null) {
				for (String st : toAlloc.getSchedules()) {
					if(st.substring(0, 5).equals(date)) {
						hr = st.substring(9, 22);
					}
				}
			}
			
			System.out.println(hr);
			
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
					System.out.println(sch[op-1] + " e " + hr);
					if(sch[op-1].equals(hr))
						System.out.println("Already allocated, try again");
					else
						x = false;
						
				}else {
					x = false;
				}
				
			}while(x);
			
			ArrayList<String> schedules = toAlloc.getSchedules();
			if(schedules == null) {
				schedules = new ArrayList<String>();
			}
			
			toAlloc.setSchedules(schedules);
			
			Activity act = new Activity(userType);
			
			schedules.add(date + " at " + sch[op-1] + "\n" + act);
			toAlloc.setaState("Alocated");
			System.out.println("Allocation Concluded");		
		}
		
	}

}
