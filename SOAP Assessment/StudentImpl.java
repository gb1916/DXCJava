package com.soap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentImpl implements StudentIn {
	private static Map<Integer,Student> students = new HashMap<Integer,Student>();

	public boolean addStudent(Student s) {
		// TODO Auto-generated method stub
		if(students.get(s.getId())!=null)
			return false;
		students.put(s.getId(), s);	
		return true;

	}

	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		if(students.get(id)==null)
			return false;
			students.remove(id);
			return true;
	}

	public Student getStudnet(int id) {
		// TODO Auto-generated method stub
		return students.get(id);

	}

	public Student[] getAllStudent() {
		// TODO Auto-generated method stub
		Set<Integer>ids=students.keySet();
		Student[] s=new Student[ids.size()];
		int i=0;
		for(Integer id:ids) {
			s[i]=students.get(id);
			i++;
		}
		return s;

	}
	

}