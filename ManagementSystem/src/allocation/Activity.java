package allocation;

import java.util.Scanner;

import ProtectionProxy.ActivityProxy;
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
		
		System.out.println("What activity will be plan?"
				+ "1- Normal Class\n"
				+ "2- Presentation\n"
				+ "3- Laboratory\n");
		
		setType(scanI.nextInt());
		ActivityProxy ap = new ActivityProxy(userType, getType());
		
		while(ap.acessActivity() == false){
			System.out.println("Choose another activity\n");
			ap.setOption(scanI.nextInt());
		}
		
		System.out.println("Type a title");
		setTitle(scan.nextLine());
		System.out.println("Type the participants");
		setParticipants(scan.nextLine());
		System.out.println("Set a description");
		setDescription(scan.nextLine());
		System.out.println("Support material (type 'none' in case of no material)");
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
	
	
	@Override
	public String toString() {
		return "Title: " + getTitle() + "  Type: "+ getType() + "\nParticipants: " + getParticipants() + "  Support Material: " + getSupportMaterial() + "\nDescription: " + getDescription() + "\n";
	}

}
