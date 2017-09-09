package allocation;

import java.util.ArrayList;
import java.util.Scanner;

import Strategy.Strategy;
import managementSystem.Auxiliar;
import managementSystem.Consult;
import users.User;

public class Allocate extends Strategy{
	
	public Allocation Allocate(ArrayList<Allocation> alloc, User u) {
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
			toAlloc.setDate(date);
			ArrayList<String> hr = null;
						
			if(toAlloc.getSchedules() != null) {
				for (String st : toAlloc.getSchedules()) {
					if(st.substring(0, 5).equals(date)) {
						if(hr==null)
							hr = new ArrayList<String>();
						hr.add(st.substring(9, 22));
					}
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
					
					for (String i : hr) {
						String j = i;
						if(sch[op-1].equals(j)) {
							System.out.println("Already allocated, try again");
							x = true;
							break;
						}else
							x = false;
					}
				}else {
					x = false;
				}
				
			}while(x);
			
			ArrayList<String> schedules = toAlloc.getSchedules();
			ArrayList<String> ids = toAlloc.getIds();
			if(schedules == null) 
				schedules = new ArrayList<String>();
			if(ids == null)
				ids = new ArrayList<String>();
			
			toAlloc.setSchedules(schedules);
			toAlloc.setIds(ids);
			
			Activity act = new Activity(u.getType());
			
			schedules.add(date + " at " + sch[op-1] + "\n" + act);
			ids.add(u.getID());
			
			toAlloc.setaState("Alocated");
			u.setAllocations(u.add(u.getAllocations(), date + " " + toAlloc.getName()+ " at " + sch[op-1]));
			System.out.println("Allocation Concluded");
			
		}
		
		return toAlloc;
	}
	
	public void confirmAllocation(User u, Consult allocs) {
		
		Auxiliar aux = new Auxiliar();
		Scanner scan = new Scanner(System.in);
		int option;
		
		ArrayList<String> a = u.getAllocations();
		ArrayList<String> forToday = new ArrayList<String>();
		ArrayList<String> forTodayHours = new ArrayList<String>();
		
		System.out.println("Allocations planned for today:");
		if(a!=null) {
			int conf=0;
			for(String s : a) {
				String date = s.substring(0, 5);
				if(date.equals(aux.currentDate())) {
					conf=1;
					System.out.println("- " + s.substring(6));
					forToday.add(s.substring(6, 11));
					forTodayHours.add(aux.currentDate() + s.substring(11));
				}
			}
			
			
			if(conf == 0) {
				System.out.println("No allocations for today");
			}else {
				System.out.println("Confirm? (your choice will affect all allocations)\n\t1- YES/0- NO");
				option = scan.nextInt();
				String state;
				
				if(option==1) {
					state = "In Progress";
					System.out.println("Allocation Confirmed");
				}else {
					state = "In Process";
					System.out.println("Allocation cancelled");
				}
				
				System.out.println(forTodayHours);
				for(String s : forToday) {
					String ft = s;
					Allocation toConfirm = (Allocation) allocs.search(allocs.getA(), ft);
					toConfirm.setaState(state);
					
					if(option!=1) {
						for(String ss : toConfirm.getSchedules()) {
							String current = ss;
							System.out.println("Current " + current.substring(0, 22));
						
							for(String sss : forTodayHours) {
								String current2 = sss;
								
								System.out.println("Current2 " + current2);
								if(current2.equals(current.substring(0, 22))) {
									toConfirm.getSchedules().remove(toConfirm.getSchedules().indexOf(current));
									System.out.println("XXXX");
								}
								
							}
							
						}
					}
				}
				
			}
						
		}else {
			System.out.println("No allocations for today");
		}
		
	}

	
	public void setConcluded(Consult c) {
		Auxiliar aux = new Auxiliar();
		System.out.println("Setting Concluded");
		for(Object a : c.getA()) {
			Allocation al = (Allocation) a;
			if(al.getSchedules() != null) {
				for(String s : al.getSchedules()) {
					if(s.substring(0, 5).equals(aux.currentDate())) {
						al.setaState("Concluded");
					}
				}
			}
		}
	}
	
	public void backToInProcess(Consult c) {
		Auxiliar aux = new Auxiliar();
		System.out.println("Reseting Status");
		for(Object a : c.getA()) {
			Allocation al = (Allocation) a;
			if(al.getaState().equals("Concluded")) {
				al.setaState("In Process");
			}
		}
	}
	
}
