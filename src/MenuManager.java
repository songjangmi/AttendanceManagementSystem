import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		AttendanceManager attendanceManager=new AttendanceManager(input);
		selectMenu(input, attendanceManager);
			
			}
	public static void selectMenu(Scanner input, AttendanceManager attendanceManager ) {
		int num=-1;		
		while(num !=5) {
			try {
			showMenu();
			num=input.nextInt();
			switch(num) {
			case 1:
				attendanceManager.addStudent();
				break;
			case 2:
				attendanceManager.deleteSubjects();
				break;
			case 3:
				attendanceManager.editSubjects();
				break;
			case 4:
				attendanceManager.viewSubjects();
				break;
			default:
					continue;
			}			
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
		
				
			}
	}
	}
	
	public static void showMenu() {
		System.out.println("1. Add Subjects");
		System.out.println("2. Delete Subjects");
		System.out.println("3. Edit Subjects");
		System.out.println("4. View Subjects");
		System.out.println("5. Exit");
		System.out.println("Select one number between1-6:");	
	}

	public static void addStudent() {
		Scanner input=new Scanner(System.in);
		System.out.print("subject Name:");
		String subjectName=input.next();
		System.out.print("subject day/time):");
		String subjectTime=input.nextLine();
		System.out.print("professor Name:");
		String professorName=input.next();
		System.out.print("professor Phone Number:");
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