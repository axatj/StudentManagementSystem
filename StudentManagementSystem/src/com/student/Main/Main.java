package com.student.Main;

import com.student.Controller.*;
import com.student.Service.Course;
import com.student.Service.Student;

import java.util.*;

public class Main {

	public static void main(String args[]) {
		StudentController studc = new StudentController();
		ArrayList<Student> CommStudents = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to student management portal \n you want to select a choice");
		char ch;
		do {
			System.out.println("Enter the operation");
			System.out.println("1.Add a Student");
			System.out.println("2.Remove a Student");
			System.out.println("3.Search a student by name");
			System.out.println("4.Display a list of student");
			System.out.println("5.Display a list of student by course");
			System.out.println("Enter a choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				studc.Operation(choice);
				break;
			case 2:
				studc.Operation(choice);
				break;
			case 3:
				studc.Operation(choice);
				break;
			case 4:
				studc.Operation(choice);
				break;
			case 5:
				studc.Operation(choice);
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue:y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');
		System.out.println("Thank you");
	}

}
