package com.Allpackages.StudentsController;

import java.util.List;
import java.util.Objects;

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

import com.Allpackages.StudentsRepo.Students2Repository;
import com.Allpackages.entity.Students2;

@RestController
public class StudentsRestApi {

	@Autowired
	Students2Repository srp;

	// post data

	@PostMapping("/insert")
	public Students2 insertData(@RequestBody Students2 std) {

		Students2 status = srp.save(std);

		return status;

	}

	//Fetch data by student Name.
		//now there is no in built method in crud repository for this requrement .so we need to create method by using inbuilt METHOD naming conventions.
		
	@GetMapping("/students/name/{name}")
	public List<Students2> FetchByStudentName(@PathVariable String name) {
		return srp.findByName(name);
		
	}
}
