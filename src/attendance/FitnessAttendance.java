package attendance;

import java.util.Scanner;

public class FitnessAttendance extends Attendance {

	public FitnessAttendance(AttendanceKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("subject Name:");
		String subjectName=input.next();
		this.setSubjectName(subjectName);
		
		System.out.print("subject day/time):");
		String subjectTime=input.next();
		this.setSubjectTime(subjectName);
		
		char answer='x';
		while(answer!='y'&& answer!='Y'&& answer!='n'&& answer!='N')
		{
		System.out.print("Do you have an email address?(T/N)");
		answer=input.next().charAt(0);
		if(answer=='y'|| answer=='Y') {
			System.out.print("Email address:");
			String email=input.next();
			this.setEmail(email);
			break;
		}
		else if(answer=='n'|| answer=='N') {
			this.setEmail("");
			break;
		}
		else {
			
		}
		}
		
		System.out.print("professor Name:");
		String professorName=input.next();
		this.setProfessorName(professorName);
		
		System.out.print("professor Phone Number:");
		String phone=input.next();
		this.setPhone(phone);
}

	private void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}
}