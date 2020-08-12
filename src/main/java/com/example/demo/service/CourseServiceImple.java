package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;
@Service
public class CourseServiceImple implements CourseService {
	
	List<Course>list;
	 public CourseServiceImple() {
		 list=new ArrayList<>();
		 list.add(new Course(1,"Python","Basic of Python"));
		 list.add(new Course(2,"Java","Basic of java"));
		 list.add(new Course(3,"NodeJs","Basic of Node"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
@Override
	public Course getCourse(long CourseId) {
		Course c= null;
		for(Course course:list) {
			if(course.getId()==CourseId) {
				c=course;
				break;
			}
		}
		return c;
	}

@Override
public Course addCourse(Course course) {
	list.add(course);
	return course;
}}


