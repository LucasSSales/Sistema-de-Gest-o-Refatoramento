package state;

public class allocationContext implements allocationState{

	private allocationState aState;
	
	public allocationState getaState() {
		return aState;
	}

	public void setaState(allocationState aState) {
		this.aState = aState;
	}

	@Override
	public void state() {
		this.aState.state();
	}
	
}
