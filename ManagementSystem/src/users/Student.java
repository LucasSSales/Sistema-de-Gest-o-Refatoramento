package users;

import java.util.Scanner;

public class Student extends User {
	
	private String StudentType;
	private String course;
	
	public Student(){
		super();
		setType(0);
		int option;
		Scanner scan = new Scanner(System.in);
		Scanner scanS = new Scanner(System.in);
		System.out.println("What's your course?");
		setCourse(scanS.nextLine());
		
		System.out.println("What degree?"
				+ "1- graduation"
				+ "2- master's"
				+ "3- doctorate");
		option = scan.nextInt();
		if(option == 1) {
			setStudentType("Graduation");
		}else if(option == 2) {
			setStudentType("Master");
		}else if(option == 3) {
			setStudentType("Doctorate");
		}else {
			System.out.println("Invalid option!");
		}
		
		System.out.println("Register concluded!");
		
	}

	public String getStudentType() {
		return StudentType;
	}

	public void setStudentType(String studentType) {
		StudentType = studentType;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	

}
