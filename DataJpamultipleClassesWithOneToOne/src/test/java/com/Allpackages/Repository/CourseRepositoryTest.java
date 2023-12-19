package com.Allpackages.Repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Allpackages.Entity.Course;

@SpringBootTest
class CourseRepositoryTest {
	@Autowired
	CourseRepository cr;
	
	@Test
	public void testFindAllOfCourse() {
		
		List<Course> l= cr.findAll();
		System.out.println(l);
	}

}
