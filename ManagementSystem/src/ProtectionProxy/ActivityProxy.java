package ProtectionProxy;
import users.*;
public class ActivityProxy implements Acess {
	User u;
	int option;
	int userType;
	
	public ActivityProxy(int userType, int option) {
		this.option = option;
		this.userType = userType;
	}

	public User getU() {
		return u;
	}
	
	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	@Override
	public boolean acessActivity() {
		if(getOption() == 1 && userType == 0) {
			System.out.println("You can't acess this activitys");
			return false;
		}else {
			return true;
		}
		
	}
	
	
	
	
	
}
