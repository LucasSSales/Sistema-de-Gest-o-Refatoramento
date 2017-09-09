package users;

public class Adm extends User {
	
	public Adm(String name, int age) {
		super(name, age);
	}
	
	
	@Override
	public String toString() {
		return "Name: " + getName() + 
				"\nID: CLASSIFIED  Age: "+ getAge() + "\nType: ADM";
	}
}
