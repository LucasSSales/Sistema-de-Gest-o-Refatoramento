package state;

public class inProgess implements allocationState {

	@Override
	public allocationState state() {
		System.out.println("In Progress");
		return null;
	}
	

}
