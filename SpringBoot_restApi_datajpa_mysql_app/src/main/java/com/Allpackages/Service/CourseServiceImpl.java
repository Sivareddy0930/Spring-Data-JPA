package com.Allpackages.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Allpackages.CourseRepo.CourseRepository;
import com.Allpackages.Entity.Course;

@Service
public class CourseServiceImpl implements CourseServiceInterface{
	
	@Autowired
	CourseRepository cr;

	@Override
	public String insertData(Course c) {
		cr.save(c);
		return "inserted successfully" ;
	}

	@Override
	public String UpdateData(Long id, Course c) {
		
		Course cobj=cr.getReferenceById(id);
		
		if(Objects.nonNull(c.getName())&& !"".equalsIgnoreCase(c.getName())) {
			cobj.setName(c.getName());
		}
		if(Objects.nonNull(c.getPrice())&& !"".equalsIgnoreCase(c.getPrice().toString())) {
			cobj.setPrice(c.getPrice());
		}
		cr.save(cobj);
		
		return "successfully updated";
	}

	@Override
	public Course getById(Long id) {
	Optional<Course> course=cr.findById(id);
	
		if(course.isPresent()) {
			return course.get();
		}
		return null;
		
	}

	@Override
	public List<Course> getAllCourse() {
		
		return cr.findAll();
	}

	@Override
	public String deleteById(Long id) {
		if(cr.existsById(id)) {
			cr.deleteById(id);
			return "Deleted successully";
		}
		else {
			return "specified id not avliable";
		}
		
	}
		
	
}
