package com.spring.SpringBootCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.SpringBootCRUD.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
