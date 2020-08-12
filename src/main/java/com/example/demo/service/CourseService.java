package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseService {
	
	public List<Course>getCourses();
	
	public Course getCourse(long CourseId);
	
	public Course addCourse(Course course);

}
