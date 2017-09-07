package Strategy;

import java.util.ArrayList;

public class Strategy {
	
	public <T> ArrayList<T> add(ArrayList<T> a, T t){
		if(a == null) 
			a = new ArrayList<T>();
		a.add(t);
		return a;
	}
}
