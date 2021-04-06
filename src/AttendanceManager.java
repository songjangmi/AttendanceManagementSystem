import java.util.Scanner;

public class AttendanceManager {
	public static void addStudent() {
		Scanner input=new Scanner(System.in);
		System.out.print("subject Name:");
		String subjectName=input.next();
		System.out.print("subject day/time):");
		String subjectName=input.nextLine();
		System.out.print("professor Name:");
		String professorName=input.next();
		System.out.println("professor Phone Number:");
		String professorPhoneNumber=input.nextInt();
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
