package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> allStudents()
	{
		return studentRepository.findAll();
	}

	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
	}

	public Student save(Student stu) {
		return stu;
		
	}

	public Student get(int id) {
		return null;
	}

	public void delete(int id) {
		
	}
}
