package Studentdatabase;

import java.util.Scanner;

public class Student {
	
	
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses="";
	private int tutionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the student first name:");
		this.firstName = in.nextLine();
		
		System.out.println("Enter the student last name:");
		this.lastName = in.nextLine();
		
		System.out.println("1 - fresher\n2 - Experience\n3 - Junior\n4 - Senior\nEnter the student class level:");
		this.gradeYear = in.nextLine();
		
		setStudentID();	
	}
	
	private void setStudentID() {
		id++;
		this.studentID = gradeYear+id;
		
	}
	
	public void enroll() {
		do {
		    System.out.print("Enter your course to Enroll (Q to quit):");
		    Scanner in = new Scanner (System.in);
		    String course = in.nextLine();
		    if (!course.equals("Q")) {
			    courses = courses + "\n  " + course;
			    tutionBalance = tutionBalance + costOfCourse;
		    }
		    else {
		    	break;
		    	}
		} while (1 !=0);
	}
	
	
	public void viewBalance() {
		System.out.println("Your balance is: $" + tutionBalance);
	}
	
	public void payTution() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	public String toString() {
		return "Name: " + firstName +""+ lastName +
				"\nGrade Level: "+ gradeYear+
				"\nStudent ID:"+studentID+
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tutionBalance;
		
	}

}
