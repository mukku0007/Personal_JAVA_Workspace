package com.spring.SpringBootCRUD.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.SpringBootCRUD.model.Course;

@Service
public interface CourseService {

	public String insertCourse(Course course);
	
	public Course getCourseById(Integer cid);
	
	public List<Course> getAllCourses();
	
	public String deleteCourseById(Integer cid);
}
