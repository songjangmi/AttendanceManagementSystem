package attendance;

import java.util.Scanner;

public class Attendance {
	protected AttendanceKind kind=AttendanceKind.University;
	protected String subjectName;
	protected String subjectTime;
	protected String professorName;
	protected String phone;
	
	public Attendance() {
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


	public void printInfo() {
		System.out.println("subjectName:" + subjectName + " subjectTime:" + subjectTime + " professorName:" + professorName + " phone:" + phone);
	}

	public void getUserInput(Scanner input) {
		System.out.print("subject Name:");
		String subjectName=input.next();
		this.setSubjectName(subjectName);
		
		System.out.print("subject day/time):");
		String subjectTime=input.next();
		this.setSubjectTime(subjectName);
		
		System.out.print("professor Name:");
		String professorName=input.next();
		this.setProfessorName(professorName);
		
		System.out.print("professor Phone Number:");
		String phone=input.next();
		this.setPhone(phone);
	}
}
	

