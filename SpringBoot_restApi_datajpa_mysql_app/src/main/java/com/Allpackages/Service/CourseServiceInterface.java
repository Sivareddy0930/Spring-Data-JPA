package com.Allpackages.Service;

import java.util.List;

import com.Allpackages.Entity.Course;

public interface CourseServiceInterface {
	
	public abstract String insertData(Course c);
	
	public abstract String UpdateData(Long id,Course c);
	
	public Course getById(Long id);
	
	public List<Course> getAllCourse();
	
	public abstract  String deleteById(Long id);
	
}
