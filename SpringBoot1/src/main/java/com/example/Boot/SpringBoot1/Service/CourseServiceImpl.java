package com.example.Boot.SpringBoot1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Boot.SpringBoot1.Dao.CourseDao;
import com.example.Boot.SpringBoot1.Entity.Course;

@Service
public   class CourseServiceImpl implements CourseService {
	
	
	@Autowired
	private CourseDao coursedao;
	public List<Course>getCourses(){
		return coursedao.findAll();
		
	}
	public Course getCourse(long courseId) {
		return coursedao.getOne(courseId);
	}
	public Course addCourse(Course course) {
		return coursedao.save(course);
		
	}
	
	
	

}
