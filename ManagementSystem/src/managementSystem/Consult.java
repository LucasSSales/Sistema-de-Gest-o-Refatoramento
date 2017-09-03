package managementSystem;

import java.util.ArrayList;

public class Consult <T>{
	
	ArrayList<T> a;
	
	public void add(T t){
		a.add(t);
	}
	
	public void delete(String code) {
		
	}
	
	public void searchUser(String code) {
		
	}
	
	public void getRealatory() {
		for (T t : a) {
			System.out.println(t);
		}
	}

}
