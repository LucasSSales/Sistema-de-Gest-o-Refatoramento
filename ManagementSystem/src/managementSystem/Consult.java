package managementSystem;

import java.util.ArrayList;

import Strategy.Strategy;
import allocation.Allocation;
import users.User;

public class Consult <T> extends Strategy{
	
	private ArrayList<T> a;
	
	public void setA(ArrayList<T> a) {
		this.a = a;
	}

	public ArrayList<T> getA() {
		return a;
	}

}
