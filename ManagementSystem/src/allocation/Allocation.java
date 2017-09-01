package allocation;

import state.allocationState;
import state.inProcess;

public class Allocation implements allocationState {
	
	private allocationState aState;
	
	public Allocation() {
		setaState(new inProcess());
		System.out.println("status: "+ getaState());
	}
	
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






	public void alocate() {
		System.out.println("WHAT DO YOU WISH TO ALLOCATE?");
	}

}
