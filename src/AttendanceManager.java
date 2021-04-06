import java.util.Scanner;

public class AttendanceManager {
	Attendance attendance;
	Scanner input;
	AttendanceManager(Scanner input){
		this.input=input;
	}
	
	public void addStudent() {
		attendance= new Attendance();
		System.out.print("subject Name:");
		attendance.subjectName=input.next();
		System.out.print("subject day/time):");
		attendance.subjectTime=input.next();
		System.out.print("professor Name:");
		attendance.professorName=input.next();
		System.out.print("professor Phone Number:");
		attendance.phone=input.next();
				
	}
	
	public void deleteSubjects() {
		System.out.println("subject Name:");
		String subjectName=input.next();
		if(attendance==null) {
			System.out.println("the subject has not been registered");
			return;
		}
		if(attendance.subjectName==subjectName) {
			attendance=null;
			System.out.println("the subject is deeleted");
		}
	}
	
	public void editSubjects() {
		System.out.println("subject Name:");
		String subjectName=input.next();
		if(attendance.subjectName==subjectName) {
			System.out.println("the subject to be edited is "+ subjectName);
		}
	}
	
	public void viewSubjects() {
		System.out.println("subject Name:");
		String subjectName=input.next();
		if(attendance.subjectName==subjectName) {
			attendance.printInfo();
		}
}
}
