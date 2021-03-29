import java.util.Scanner;
public class MenuManagement {

	public static void main(String[] args) {
		int num=0;
		Scanner input=new Scanner(System.in);
		
		while(num !=6) {
		System.out.println("1. Add Subjects");
		System.out.println("2. Delete Subjects");
		System.out.println("3. Edit Subjects");
		System.out.println("4. View Subjects");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between1-6:");
		num=input.nextInt();
		if(num==1) {
			addStudent();
		}
		
		else if(num==2) {
			deleteSubjects();
		}
		
		else if(num==3) {
			editSubjects();
		}
		
		else if(num==4) {
			viewSubjects();
		}
		
		else  {
			continue;
		}
		
		}
	}
	public static void addStudent() {
		Scanner input=new Scanner(System.in);
		System.out.println("subject Name:");
		String subjectName=input.next();
		System.out.print("subject Class(day/time):");
		String subjectClass=input.nextLine();
		System.out.println(subjectName);
		System.out.println("professor Name:");
		String professorName=input.next();
		System.out.println( professorName);
		System.out.println("professor Phone Number:");
		int professorPhoneNumber=input.nextInt();
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