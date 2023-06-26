package com.student.Controller;

import com.student.Service.NotFoundException;
import com.student.Service.Student;
import com.student.Service.StudentManagement;
import com.student.Serviveimplementations.StudentImplementation;

public class StudentController {

	private StudentImplementation sm;

	public StudentController() {
		this.sm = new StudentImplementation();
	}

	public void Operation(int option) {
		String name = null;
		switch (option) {
		case 1:
			Student student = null;
			sm.addStudent(student);
			break;
		case 2:
			try {
			sm.removeStudent(option);
			}
			catch(NotFoundException a)
			{
				a.getMessage();
			}
			
			break;
		case 3:try
		{
			sm.searchStudent(name);
		}
		catch(NotFoundException s)
		{
			s.getMessage();
		}
			break;
		case 4:try
		{
			sm.displayStudent();
		}
		catch(NullPointerException n)
		{
			n.getMessage();
		}
			break;
		case 5:
			try
			{
			sm.displaycourse(name);
			}
			catch(NotFoundException d)
			{
				d.getMessage();
			}
			break;
		default:
			System.out.println("Invalid option");
		}
	}
}
