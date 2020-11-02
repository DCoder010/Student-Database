package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = " ";
	private int tuitionFee = 0;
	private static int courseCost = 600;
	private int id = 1000;
	
	//Constructor: to prompt user to enter students name and year
	public Student()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - I year\n2 - II year\n3 - III year\n4 - IV year"
				+ "\nEnter student class level: ");
		this.gradeYear = in.nextInt();
	
		setStudentID();
	}
	
	private void setStudentID()
	{
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll to the course
	public void enroll()
	{
		do
		{
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String subject = in.nextLine();
		if(!subject.equals("Q"))
		{
			courses = courses + "\n  " + subject;
			tuitionFee = tuitionFee + courseCost;
		}
		else
			break;
	} 
		while(1!=0);
		
	}
	
	//View Balance
	public int viewBalance()
	{
		return tuitionFee;
		
	}
	
	//Pay Tuition
	public void payTuition()
	{
		int balance = viewBalance();
		System.out.println("Your balance is $" + balance);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your payment: $");
		int payment = in.nextInt();
		tuitionFee = tuitionFee - payment;
		System.out.println("Thank you for your payment of $ " + payment);
		viewBalance();
	}
	
	//Show status
	public String showInfo()
	{
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear + 
				"\nStudent ID: " + studentID + 
				"\nCourses Enrolled : " + courses.toUpperCase() + 
				"\nBalance: $" + tuitionFee;
	}
	
}
