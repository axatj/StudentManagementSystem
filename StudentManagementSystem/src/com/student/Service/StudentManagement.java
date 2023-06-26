package com.student.Service;

import java.util.List;

public interface StudentManagement {
	
public Student addStudent(Student student);
public int removeStudent(int id);
public String searchStudent(String name);
public void displayStudent();
public String displaycourse(String course);


}
