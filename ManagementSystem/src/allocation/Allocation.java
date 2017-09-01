package allocation;

import state.allocationState;
import state.inProcess;

public class Allocation implements allocationState {
	
	private allocationState aState;
	
	public Allocation() {
		setaState(new inProcess());
	}
	
	public allocationState getaState() {
		return aState.state();
	}

	public void setaState(allocationState aState) {
		this.aState = aState;
	}

	@Override
	public allocationState state() {
		this.aState.state();
		return null;
	}






	public void alocate() {
		System.out.println("WHAT DO YOU WISH TO ALLOCATE?");
	}

}
