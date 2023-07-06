package com.student.Serviveimplementations;

import java.util.*;

import com.student.Service.*;

public class StudentImplementation implements StudentManagement {
	Student s = new Student();
	Course c = new Course();

//	private List<Student> students;
	ArrayList<Student> CommStudents = new ArrayList<>();

	Scanner sc = new Scanner(System.in);
	int size;
	// public StudentImplementation() {
//		students = new ArrayList<>();
//	}

	@Override
	public Student addStudent(Student s) {

		System.out.println("Enter student size");
		size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter students details");
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter Student name");
			String name = sc.next();
			System.out.println("Enter grade");
			double grade = sc.nextDouble();
			System.out.println("Enter Course details");
			System.out.println("Enter course id");
			int c_id = sc.nextInt();
			System.out.println("Enter course name");
			String c_name = sc.next();
			Student st = new Student(id, name, grade, new Course(c_id, c_name));
			CommStudents.add(st);

		}
		return s;

	}

	@Override
	public int removeStudent(int id) {
		System.out.println("Enter id you want to remove student");
		id = sc.nextInt();
	
		if (CommStudents.isEmpty()) {
			throw new NotFoundException();
		}
		boolean isPresent=false;
		for(int i=0;i<CommStudents.size();i++)
		{
			if(id==CommStudents.get(i).getId())
			{
				 isPresent=true;
				 
				 
			}
			 
		if(isPresent==true)
		{
			for(int i1=0;i1<CommStudents.size();i1++)
			{
				if(id==CommStudents.get(i1).getId())
				{
					CommStudents.remove(i1);
					System.out.println("Removed Successfully");
				}
		}
		}
			else
			{
				throw new NotFoundException();
			}
		}
		return id;
		}

		
		 
	@Override
	public String searchStudent(String name) {
		System.out.println("Enter search student by name");
		name = sc.next();
		if (CommStudents.isEmpty()) {
			throw new NotFoundException();
		}
		boolean isPresent=false;
		
			for (Student Student : CommStudents) {
				if (Student.getName().equalsIgnoreCase(name)) {
					isPresent=true;
					break;
				} 
			}
			if(isPresent==true)
			{
				for (Student Student1 : CommStudents) {
					if (Student1.getName().equalsIgnoreCase(name)) {
						System.out.println(Student1);
					}  
			}
			}
			else {
			throw new NotFoundException();
			}
			
			return name;
		}
	

	@Override
	public void displayStudent() {
		System.out.println("ALl List of student");
		try {
			if (CommStudents.isEmpty()) {
				throw new NullPointerException("Student not added in the list");

			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		for (Student Student : CommStudents) {
			System.out.println(
					Student.getId() + " " + Student.getName() + " " + Student.getCourse() + " " + Student.getGrade());
		}

	}

	@Override
	public String displaycourse(String course) {
		System.out.println("Display Students by course ");
		course = sc.next();
		if (CommStudents.isEmpty()) {
			throw new NotFoundException();
		 
		} 
		boolean isPresent=false;
		
			for (Student Student1 : CommStudents) {
				if (Student1.getCourse().getCourse_name().equalsIgnoreCase(course)) {
					isPresent=true;
				    break;   
				}  
				
			}
			if(isPresent==true)
			{
				for (Student Student1 : CommStudents) {
					if (Student1.getCourse().getCourse_name().equalsIgnoreCase(course))
				System.out.println(Student1.getId() + " " + Student1.getName() + " " + Student1.getCourse() + " "
						+ Student1.getGrade());
			}
			}
	
			else
			{
				throw new NotFoundException();
			}
	 
			return course;
		}


}