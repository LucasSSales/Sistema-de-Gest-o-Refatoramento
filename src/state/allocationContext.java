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
	public allocationState state() {
		return this.aState.state();
	}
	
}
