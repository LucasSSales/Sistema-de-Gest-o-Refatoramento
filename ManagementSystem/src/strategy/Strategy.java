package Strategy;

import java.util.ArrayList;

import allocation.Allocation;
import users.User;

public class Strategy<T> {
	
	public ArrayList<T> add(ArrayList<T> a, T t){
		if(a == null) 
			a = new ArrayList<T>();
		a.add(t);
		return a;
	}
	
	public Object search (ArrayList<T> a, String key) {
		T found = null;
		if(a!=null) {
			for (T t : a) {
				try {	
					Allocation x = (Allocation) t;
					if(x.getName().equals(key) || x.getCode().equals(key)) {
						found = (T) x;
						break;
					}
											
				}catch(ClassCastException exception) {	
					User x = (User) t;
					if(x.getName().equals(key) || x.getID().equals(key)) {
						found = (T) x;
						break;
					}	
				}			
			}
		}
		return found;
	}
	
	public void delete (ArrayList<T> a, T t) {
		a.remove(a.indexOf(t));
		System.out.println("Removed from list");
	}
	
	public void delete (ArrayList<T> a, int index) {
		a.remove(index);
		System.out.println("Removed from list");
	}
	
	
	// java.lang.ClassCastException (nao casta user p allocation)
}
