package allocation;

import java.util.ArrayList;
import java.util.Scanner;

import state.*;

public class Allocation implements AllocState {
	
	private String name;
	private String code;
	private String date;
	private ArrayList<String> schedules;
	private ArrayList<String> ids;
	//private String aState;
	private ArrayList<Activity> activity;
	
	
	public Allocation(String name, String code) {
		this.name = name;
		this.code = code;
		setaState(new InProcess());
	}
	
	
	private AllocState aState;

	public AllocState getaState() {
		return aState;
	}

	public void setaState(AllocState aState) {
		this.aState = aState;
	}

	@Override
	public String state() {
		return this.aState.state();
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

	public ArrayList<Activity> getActivity() {
		return activity;
	}

	public void setActivity(ArrayList<Activity> activity) {
		this.activity = activity;
	}

	public ArrayList<String> getIds() {
		return ids;
	}

	public void setIds(ArrayList<String> ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "  Status: " + state();
	}
	
}
