package allocation;

import java.util.Scanner;

import users.User;

public class Activity {
	
	private int type;
	private String title;
	private String description;
	private String participants;
	private String supportMaterial;
	
	
	public Activity(int userType) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scanI = new Scanner(System.in);
		String str = new String();
		int op;
		
		System.out.println("What activity will be plan?");
		System.out.print("1-Presentation\n"
				+ "2- Laboratory\n");
		if(userType != 0)
			System.out.println("3-Normal Class");
		
		setType(scanI.nextInt());
		
		System.out.println("Type a title");
		setTitle(scan.nextLine());
		System.out.println("Type the participants");
		setParticipants(scan.nextLine());
		System.out.println("Set a description");
		setDescription(scan.nextLine());
		System.out.println("Support matreial (type 'none' in case of no material)");
		setSupportMaterial(scan.nextLine());		
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getParticipants() {
		return participants;
	}
	public void setParticipants(String participants) {
		this.participants = participants;
	}
	public String getSupportMaterial() {
		return supportMaterial;
	}
	public void setSupportMaterial(String supportMaterial) {
		this.supportMaterial = supportMaterial;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

}
