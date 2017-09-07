package Strategy;

import java.util.ArrayList;

public class Strategy {
	//add elements on lists
	public <T> ArrayList<T> add(ArrayList<T> a, T t){
		if(a == null) 
			a = new ArrayList<T>();
		a.add(t);
		return a;
	}
}
