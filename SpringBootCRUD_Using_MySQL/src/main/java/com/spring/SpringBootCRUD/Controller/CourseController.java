package com.spring.SpringBootCRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringBootCRUD.Service.CourseService;
import com.spring.SpringBootCRUD.model.Course;

import lombok.Delegate;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course course) {
	  String status = courseService.insertCourse(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course> getCourseById(@PathVariable Integer cid) {
		Course course = courseService.getCourseById(cid);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
	}
	
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deleteCourseById(@PathVariable Integer cid) {
		String status = courseService.deleteCourseById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
