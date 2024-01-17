package com.spring.SpringBootCRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringBootCRUD.Repository.CourseRepository;
import com.spring.SpringBootCRUD.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public String insertCourse(Course course) {
		courseRepository.save(course);
		return "Course Added Successfully";
	}

	@Override
	public Course getCourseById(Integer cid) {
	 Optional<Course> findById = courseRepository.findById(cid);
	 	if(findById.isPresent()) {
	 		return findById.get();
	 	}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public String deleteCourseById(Integer cid) {
		if(courseRepository.existsById(cid)) {
			courseRepository.deleteById(cid);
			return "Deleted Successfully";
		} else {
			return "No Record Found"; 
		}
	}
}
