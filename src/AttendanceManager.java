import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import attendance.Attendance;
import attendance.AttendanceInput;
import attendance.AttendanceKind;
import attendance.FitnessAttendance;
import attendance.PersonalTrainingAttendance;
import attendance.UniversityAttendance;

public class AttendanceManager {
	ArrayList<AttendanceInput> attendances= new ArrayList<AttendanceInput>();
	Scanner input;
	AttendanceManager(Scanner input){
		this.input=input;
	}
	
	public void addStudent() {
		int kind=0;
		AttendanceInput attendanceInput;
		while(kind<=1 || kind >3) {
			try {
		System.out.print("go into add attendances in while");
		System.out.print("1 for University");
		System.out.print("2 for Fitness");
		System.out.print("3 for Personal Training");
		System.out.print("Select num 1,2, or 3 for Attendance Kind:");
		kind=input.nextInt();
		if(kind==1) {
			attendanceInput= new UniversityAttendance(AttendanceKind.University);
			attendanceInput.getUserInput(input);
			attendances.add(attendanceInput);
			break;
		}
		else if (kind==2) {
			attendanceInput= (AttendanceInput) new FitnessAttendance(AttendanceKind.Fitness);
			attendanceInput.getUserInput(input);
			attendances.add(attendanceInput);
			break;
		}
		
		else if (kind==3) {
			attendanceInput= (AttendanceInput) new PersonalTrainingAttendance(AttendanceKind.PersonalTraining);
			attendanceInput.getUserInput(input);
			attendances.add(attendanceInput);
			break;
		}
		
		else {
			System.out.print("Select num for Attendance Kind between 1 and 2:");
		}
		}	
		catch(InputMismatchException e) {
			System.out.println("Please put an integer between 1 and 3!");
			if(input.hasNext()) {
				input.next();
			}
			kind=-1;
			
		}
	}
	}
	
	public void deleteSubjects() {
		System.out.println("subject Name:");
		String subjectName=input.next();
		int index=findIndex(subjectName);
		removefromSubjects(index, subjectName);
	}
	
	public int findIndex(String subjectName) {
		int index=-1;
		for(int i=0; i<attendances.size(); i++) {
			if(attendances.get(i).getSubjectName()==subjectName) {
				index=i;
				break;
			}
		}
		return index;
	}
		
	
	public int removefromSubjects(int index, String subjectName) {
		if  (index>=0) {
			attendances.remove(index);
			System.out.println("the student "+ subjectName + "is deleted");
			return 1;
		}
		else {
			System.out.println("the subject has not been registered");
			return -1;
		}
		
	}
	
	
	public void editSubjects() {
		System.out.print("subject Name:");
		String subjectName=input.next();
		for(int i=0; i<attendances.size(); i++) {
			AttendanceInput attendance=attendances.get(i);
			if(attendance.getSubjectName()==subjectName) {
				int num=-1;		
				while(num !=5) {
					showEditSubjects();
					num=input.nextInt();
					switch(num) {
					case 1:
						attendance.setSubjectName( input);
						break;
					case 2:	
						attendance.setSubjectTime( input);
						break;
						
					case 3:
						attendance.setprofessorName( input);
						break;
					case 4:	
						attendance.setPhone(input);
						break;
						default:
							continue;					
					}			
				}
				break;
					
			}
		}
	}
	
	public void viewSubjects() {
		System.out.println("# of registered attendances:" + attendances.size());
		for(int i=0; i<attendances.size(); i++) {
			attendances.get(i).printInfo();			
		}
		}

	
	public void showEditSubjects() {	
		System.out.println("**Subject ivfo Edit Menu**");
		System.out.println("1. Add Subjects");
		System.out.println("2. Delete Subjects");
		System.out.println("3. Edit Subjects");
		System.out.println("4. View Subjects");
		System.out.println("5. Exit");
		System.out.println("Select one number between1-6:");
		
	}
}

