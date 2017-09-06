package managementSystem;

import java.util.ArrayList;

public class Relatory {
	
	private int numUsers;
	private int numAlloc;
	
	public Relatory() {
		setNumAlloc(0);
		setNumUsers(0);
	}
	
		
	public <T> void getRelatory(ArrayList<T> a) {
		for (T t : a) {
			System.out.println(t);
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
