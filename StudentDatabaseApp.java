package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		//Ask how many new students to be added
		System.out.print("Enter number of dtudents to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] st = new Student[numOfStudents];
		
		for(int i=0; i<numOfStudents; i++)
		{
			st[i] = new Student();
			st[i].enroll();
			st[i].payTuition();
		}
		
		for(int i=0; i<numOfStudents; i++)
		{
			System.out.println("====================================");
			System.out.println(st[i].showInfo());
			System.out.println("====================================");
		}
		
	}

}
