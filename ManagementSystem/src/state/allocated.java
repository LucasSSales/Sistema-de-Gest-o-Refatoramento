package state;

public class allocated implements allocationState{

	@Override
	public allocationState state() {
		System.out.println("Allocated");
		return null;
	}
	
}
