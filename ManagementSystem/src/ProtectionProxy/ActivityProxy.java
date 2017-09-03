package ProtectionProxy;
import users.*;
public class ActivityProxy implements Acess {
	User u;
	
	public ActivityProxy(User u) {
		this.u = u;
	}

	public User getU() {
		return u;
	}

	@Override
	public void acessActivity() {
		if(u.haveAcess()) {
			//DO SOMETHING
		}else {
			System.out.println("You can't acess this activity");
		}
		
	}
	
	
	
	
	
}
