package com.Allpackages.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Allpackages.Entity.Course;
import com.Allpackages.Service.CourseServiceImpl;
import com.Allpackages.Service.CourseServiceInterface;

@RestController
public class CourseController {
	
	@Autowired
	private CourseServiceImpl csi;
	
	@PostMapping("/post")
	public ResponseEntity<String> insertData(@RequestBody Course course){
		String status=csi.insertData(course);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateData(@PathVariable Long id,@RequestBody Course course){
		
		String status=csi.UpdateData(id, course);
		
		return new ResponseEntity<>(status,HttpStatus.OK);
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Course> getByid(@PathVariable Long id){
		Course course=csi.getById(id);
		return new ResponseEntity<>(course,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Course>> getAll(){
		List<Course> l=csi.getAllCourse();		
		return new ResponseEntity<>(l,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> DeleteById(@PathVariable Long id ){
		String status=csi.deleteById(id);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	
	
}
