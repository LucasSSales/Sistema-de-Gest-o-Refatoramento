package activities;

import users.User;

public class Activity {
	
	private String type;
	private String title;
	private String description;
	private User[] participants;
	private String supportMaterial;
	
	
	public Activity() {
		
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
	public User[] getParticipants() {
		return participants;
	}
	public void setParticipants(User[] participants) {
		this.participants = participants;
	}
	public String getSupportMaterial() {
		return supportMaterial;
	}
	public void setSupportMaterial(String supportMaterial) {
		this.supportMaterial = supportMaterial;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
