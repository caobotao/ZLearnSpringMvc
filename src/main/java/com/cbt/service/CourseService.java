package com.cbt.service;

import org.springframework.stereotype.Service;

import com.cbt.model.Course;


@Service
public interface CourseService {
	
	
	Course getCoursebyId(Integer courseId);
	

	
	

}
