package com.soap;

public interface StudentIn {
public boolean addStudent(Student s);
	
	public boolean deleteStudent(int id);
	
	public Student getStudnet(int id);
	
	public Student[] getAllStudent();
}
