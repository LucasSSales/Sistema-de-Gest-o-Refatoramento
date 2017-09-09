package users;

import java.util.ArrayList;
import java.util.Scanner;

import Strategy.Strategy;
import allocation.Allocation;


public class User<T> extends Strategy<T>{
	
	private String name;
	private int age;
	private String ID;
	private int type;	
	private ArrayList<String> allocations;
	
	
	public User (String name, int age) {
		this.name = name;
		this.age = age;
		setType(-1);
		setID("ADM0");
	}
	
	public User(int numUsers) {
		Scanner scan = new Scanner(System.in);
		Scanner scanI = new Scanner(System.in);
		System.out.println("NAME:");
		setName(scan.nextLine());
		System.out.println("AGE: ");
		setAge(scanI.nextInt());
	}
	
	public int haveAcess() {
		return getType();
	}
	
	public boolean isAdm() {
		if(type == -1) {
			return true;
		}else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public ArrayList<String> getAllocations() {
		return allocations;
	}

	public void setAllocations(ArrayList<String> allocations) {
		this.allocations = allocations;
	}

	public String toString(){
		return "Name: " + getName() + 
				"\nID: " + getID() + "  Age: "+ getAge();
	}
}
