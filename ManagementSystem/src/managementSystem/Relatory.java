package managementSystem;

import java.util.ArrayList;

import allocation.Allocation;

public class Relatory {
	
	private int numUsers;
	private int numAlloc;
	
	public Relatory() {
		setNumAlloc(0);
		setNumUsers(0);
	}
	
	public void getRelatory(ArrayList<Allocation> a) {
		for (Allocation alloc : a) {
			System.out.println(alloc);
			haveSchedules(alloc);
			System.out.println();
		}
	}

	public void haveSchedules(Allocation a) {
		if(a.getSchedules() == null)
			System.out.println("No allocations planned");
		else {
			for (String sch : a.getSchedules()) {
				System.out.println(sch);
			}
		}
	}
	

	public int getNumUsers() {
		return numUsers;
	}


	public void setNumUsers(int numUsers) {
		this.numUsers = numUsers;
	}


	public int getNumAlloc() {
		return numAlloc;
	}

	public void setNumAlloc(int numAlloc) {
		this.numAlloc = numAlloc;
	}
}
