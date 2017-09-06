package users;

import java.util.Scanner;

public class User {
	
	private String name;
	private int age;
	private int ID;
	private int type;
	private String kind;
	private String desc;
	
	
	public User() {
		Scanner scan = new Scanner(System.in);
		Scanner scanI = new Scanner(System.in);
		System.out.println("NAME:");
		setName(scan.nextLine());
		System.out.println("AGE: ");
		setAge(scanI.nextInt());
	}
	
	public boolean haveAcess() {
		if(type == 0) {
			return false;
		}else {
			return true;
		}
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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	

	public String toString(){
		return "Name: " + getName() + 
				"\nID: " + getID() + "  Age: "+ getAge() + "  Type: " + getKind() +
				"\n" + getDesc() + "\n";
	}
}
