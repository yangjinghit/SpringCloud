package com.yj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yj.Student;

@Component
public class ProduceClientServiceFallBack implements ProduceClientService{

	@Override
	public Object list() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(22222l, "22222", 2222));
		
		
		return students;
	}

}
