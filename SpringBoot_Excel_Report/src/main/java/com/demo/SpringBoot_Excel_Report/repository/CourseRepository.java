package com.demo.SpringBoot_Excel_Report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringBoot_Excel_Report.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
