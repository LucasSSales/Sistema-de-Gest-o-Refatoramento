package users;

public class User {
	
	private String name;
	private int age;
	private int ID;
	private int type;
	
	
	public User() {
		System.out.println("NAME:");
		System.out.println("AGE: ");
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
	
	
	

}
