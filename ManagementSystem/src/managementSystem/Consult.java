package managementSystem;

import java.util.ArrayList;

public class Consult <T>{
	
	private ArrayList<T> a;
	
	public void add(T t){
		if(a == null) {
			a = new ArrayList<T>();
			a.add(t);
		}else
			a.add(t);
	}
	
	public void delete(String code) {
		
	}
	
	public void searchUser(String code) {
		
	}
	
	public void doConsult() {
		for (T t : a) {
			//buscar
		}
	}

	public ArrayList<T> getA() {
		return a;
	}

}
