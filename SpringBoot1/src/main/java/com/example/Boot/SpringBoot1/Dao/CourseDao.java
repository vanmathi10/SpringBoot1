package com.example.Boot.SpringBoot1.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Boot.SpringBoot1.Entity.Course;

	public interface CourseDao extends JpaRepository<Course,Long>{
		
	}
	
