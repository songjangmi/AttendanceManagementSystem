import java.util.Scanner;
public class MenuManagement {

	public static void main(String[] args) {
		
		AttendanceManager attendanceManager=new AttendanceManager();
		Scanner input=new Scanner(System.in);
		int num=5;		
		while(num !=5) {
		System.out.println("1. Add Subjects");
		System.out.println("2. Delete Subjects");
		System.out.println("3. Edit Subjects");
		System.out.println("4. View Subjects");
		System.out.println("5. Exit");
		System.out.println("Select one number between1-6:");
		num=input.nextInt();
		if(num==1) {
			attendanceManager.addStudent();
		}
		
		else if(num==2) {
			attendanceManager.deleteSubjects();
		}
		
		else if(num==3) {
			attendanceManager.editSubjects();
		}
		
		else if(num==4) {
			attendanceManager.viewSubjects();
		}
		
		else  {
			continue;
		}
		
		}
	}
	public static void addStudent() {
		Scanner input=new Scanner(System.in);
		System.out.print("subject Name:");
		String subjectName=input.next();
		System.out.print("subject day/time):");
		String subjectTime=input.nextLine();
		System.out.print("professor Name:");
		String professorName=input.next();
		System.out.println("professor Phone Number:");
		String professorPhoneNumber=input.next();
		System.out.println(professorPhoneNumber);		
	}
	
	public static void deleteSubjects() {
		Scanner input=new Scanner(System.in);
		System.out.println("subject Name:");
		String subjectName=input.next();
	}
	
	public static void editSubjects() {
		Scanner input=new Scanner(System.in);
		System.out.println("subject Name:");
		String subjectName=input.next();
	}
	
	public static void viewSubjects() {
		Scanner input=new Scanner(System.in);
		System.out.println("subject Name:");
		String subjectName=input.next();
	}
	
}