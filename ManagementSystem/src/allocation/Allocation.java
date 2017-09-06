package allocation;

import java.util.ArrayList;
import java.util.Scanner;

import state.AllocStatus;
import state.allocationState;

public class Allocation extends AllocStatus {
	
	private String name;
	private String code;
	private String date;
	private ArrayList<String> schedules;
	private String aState;
	private Activity activity;
	
	
	public Allocation(String name, String code) {
		this.name = name;
		this.code = code;
		setaState(inProcess());
	}
	

	public String getaState() {
		return aState;
	}


	public void setaState(String aState) {
		this.aState = aState;
	}


	public void registerNew() {
		System.out.println("What type of allocation will be registered?"
				+ "1- Projector\n"
				+ "2- Classroom\n"
				+ "3- Labaoratory");
		
		//if 1, new proj
		//if 2, new class
		//if 3, new lab
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<String> getSchedules() {
		return schedules;
	}

	public void setSchedules(ArrayList<String> schedules) {
		this.schedules = schedules;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "   Status: " + getaState();
	}
	
	
	

}
