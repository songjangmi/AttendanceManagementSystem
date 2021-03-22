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
		switch(num) {
		case 1:  
			System.out.print("subject Name:");
			String subjectName=input.next();
			System.out.print("subject Class(day/time):");
			String subjectClass=input.next();
			break;
			
		case 2:
		case 3:
		case 4:
			System.out.print("subject Name:");
			String subjectName2=input.next();
		}
	}
}
}