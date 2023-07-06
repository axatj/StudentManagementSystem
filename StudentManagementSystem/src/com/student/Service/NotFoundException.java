package com.student.Service;

public class NotFoundException extends RuntimeException{
public NotFoundException()
{
System.out.println("Student not found in the system");
}
public NotFoundException(String msg)
{
super(msg);	
}
}

