package com.example.Boot.SpringBoot1.Service;

import java.util.List;

import com.example.Boot.SpringBoot1.Entity.Course;


	public interface CourseService {
		public List<Course>getCourses();

		public Course getCourse(long courseId);
		public Course addCourse(Course course);
	
		

	}


