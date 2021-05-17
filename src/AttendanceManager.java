import java.util.ArrayList;
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
		while(kind!=1 && kind !=2) {
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
			attendanceInput= new FitnessAttendance(AttendanceKind.Fitness);
			attendanceInput.getUserInput(input);
			attendances.add(attendanceInput);
			break;
		}
		
		else if (kind==3) {
			attendanceInput= new PersonalTrainingAttendance(AttendanceKind.PersonalTraining);
			attendanceInput.getUserInput(input);
			attendances.add(attendanceInput);
			break;
		}
		
		else {
			System.out.print("Select num for Attendance Kind between 1 and 2:");
		}
		}		
	}
	
	public void deleteSubjects() {
		System.out.println("subject Name:");
		String subjectName=input.next();
		int index=-1;
		for(int i=0; i<attendances.size(); i++) {
			if(attendances.get(i).getSubjectName()==subjectName) {
				index=i;
				break;
			}
		}
		if  (index>=0) {
			attendances.remove(index);
			System.out.println("the student "+ subjectName + "is deleted");
		}
		else {
			System.out.println("the subject has not been registered");
			return;
		}
		
	}
	
	public void editSubjects() {
		System.out.print("subject Name:");
		String subjectName=input.next();
		for(int i=0; i<attendances.size(); i++) {
			AttendanceInput attendanceInput=attendances.get(i);
			if(attendanceInput.getSubjectName()==subjectName) {
				int num=-1;		
				while(num !=5) {
					System.out.println("**Subject ivfo Edit Menu**");
					System.out.println("1. Add Subjects");
					System.out.println("2. Delete Subjects");
					System.out.println("3. Edit Subjects");
					System.out.println("4. View Subjects");
					System.out.println("5. Exit");
					System.out.println("Select one number between1-6:");
					num=input.nextInt();
					if(num==1) {
						System.out.print("subject Name:");
						String SubjectName=input.next();
						attendanceInput.setSubjectName(subjectName);
					}
			
					else if(num==2) {
						System.out.print("subject day/time):");
						String subjectTime=input.next();
						attendanceInput.setSubjectTime(subjectTime);
				
					}
			
					else if(num==3) {
						System.out.print("professor Name:");
						String professorName=input.next();
						attendanceInput.setProfessorName(professorName);
						
					}
			
					else if(num==4) {
						System.out.print("professor Phone Number:");
						String phone=input.next();
						attendanceInput.setPhone(phone);
					}
			
					else  {
						continue;
					}
			
				}
				break;
					
			}
		}
	}
	
	public void viewSubjects() {
//		System.out.println("subject Name:");
//		String subjectName=input.next();
		System.out.println("# of registered attendances:" + attendances.size());
		for(int i=0; i<attendances.size(); i++) {
			attendances.get(i).printInfo();
			
		}
		}
		
}

