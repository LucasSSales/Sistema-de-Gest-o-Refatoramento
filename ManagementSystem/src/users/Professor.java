package users;

import java.util.Scanner;

public class Professor extends User {
	
	private String subject;
	
	public Professor(int numUsers){
		super(numUsers);
		setID("PRF" + numUsers);
		setType(1);
		Scanner scanS = new Scanner(System.in);
		System.out.println("What subject you'll teach?");
		setSubject(scanS.nextLine());
		
		System.out.println("Register concluded!");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return super.toString() + "  Type: Professor\n"
				+ "Subject: " + getSubject();
	}
}
