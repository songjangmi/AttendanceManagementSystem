package attendance;

import java.util.Scanner;

public  abstract class Attendance implements  AttendanceInput {
	protected AttendanceKind kind=AttendanceKind.University;
	protected String subjectName;
	protected String subjectTime;
	protected String professorName;
	protected String phone;
	
	public Attendance() {
	}
	
	 public Attendance(AttendanceKind kind) {
		this.kind=kind;
	}

	public Attendance(String subjectName, String subjectTime) {
		this.subjectName = subjectName;
		this.subjectTime = subjectTime;
	}

	public Attendance(String subjectName, String subjectTime, String professorName, String phone) {
		this.subjectName=subjectName;
		this.subjectTime=subjectTime;
		this.professorName=professorName;
		this.phone=phone;
	}
	
	public Attendance(AttendanceKind kind, String subjectName, String subjectTime, String professorName, String phone) {
		this.kind=kind;
		this.subjectName=subjectName;
		this.subjectTime=subjectTime;
		this.professorName=professorName;
		this.phone=phone;
	}
	
	public AttendanceKind getKind() {
		return kind;
	}

	public void setKind(AttendanceKind kind) {
		this.kind = kind;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectTime() {
		return subjectTime;
	}

	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public abstract void printInfo(); 
	
	public void setSubjectName(Scanner input) {
		System.out.print("subject Name:");
		String subjectName=input.next();
		this.setSubjectName(subjectName);
	}
	
	public void setSubjectTime( Scanner input) {
		System.out.print("subject day/time):");
		String subjectTime=input.next();
		this.setSubjectTime(subjectTime);
	}
	
	public void setprofessorName( Scanner input) {
		System.out.print("professor Name:");
		String professorName=input.next();
		this.setProfessorName(professorName);
	}
	
	public void setPhone(Scanner input) {
		System.out.print("professor Phone Number:");
		String phone=input.next();
		this.setPhone(phone);
	}
	
	public String getKindString() {
		String skind="none";
		switch(this.kind) {
		case University:
			skind="Univ.";
			break;		
		case Fitness:
			skind="fit.";
			break;			
		case PersonalTraining:
			skind="Personal.";
			break;	
		default:
			
		}
		return skind;
	}

	public void getUserInput(Scanner input) {
		// TODO Auto-generated method stub
		
	}

	
}
	

