package state;

public class inProcess implements allocationState {

	@Override
	public allocationState state() {
		System.out.println("In Process");
		return null;
	}
}
