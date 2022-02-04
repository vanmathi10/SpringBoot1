package com.example.Boot.SpringBoot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Boot.SpringBoot1.Entity.Course;
import com.example.Boot.SpringBoot1.Service.CourseService;
@RestController
public class MyContoller {
@Autowired
private CourseService obj;
@GetMapping("/courses")
public List<Course>getcourses(){
	return this.obj.getCourses();
	}
@GetMapping("/courses/{courseId}")
public Course getCourse(@PathVariable String courseId) {
	return this.obj.getCourse(Long.parseLong(courseId));
	
}
@PostMapping("/addCourse")
public Course addCourse(@RequestBody Course course) {
	return this.obj.addCourse(course);
	
}
}
