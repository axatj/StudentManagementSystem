package com.student.Service;

public class Student {
	private int id;
	private String name;
	private Course course;
	private double grade;
	public Student()
	{
		
	}

	public Student(int id, String name,double grade,Course course) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.course = course;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Course getCourse() {
		return course;
	}

	public double getGrade() {
		return grade;
	}

	public String toString() {
		return id + " " + name + " " + course + " " + grade;
	}
}
