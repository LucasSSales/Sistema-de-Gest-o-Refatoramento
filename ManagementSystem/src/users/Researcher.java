package users;

import java.util.Scanner;

public class Researcher extends User {
	
	private String research;

	public Researcher(){
		super();
		setType(1);
		Scanner scanS = new Scanner(System.in);
		System.out.println("What's your research?");
		setResearch(scanS.nextLine());
		
		System.out.println("Register concluded!");
	}

	public String getResearch() {
		return research;
	}

	public void setResearch(String research) {
		this.research = research;
	}
	
	
	
	
	
}
