package com.luv2code.servletdemo.mvcstudent.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		//create empty list
		List<Student> students = new ArrayList<>();
		
		//add STUB data
		students.add(new Student("Michael", "Bae", "mich_bae@holly.com"));
		students.add(new Student("Maria", "Gonzales", "m.gonzo@mail.com"));
		students.add(new Student("Charles", "Glosterkwotch", "douches@westlberry.com"));
		
		//return list
		return students;
	}
	
}