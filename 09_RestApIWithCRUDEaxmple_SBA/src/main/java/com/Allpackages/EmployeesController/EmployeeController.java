package com.Allpackages.EmployeesController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Allpackages.EmployeesEntity.Employees;
import com.Allpackages.EmployeesServices.EmployeesServiceImple;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeesServiceImple esi;
	
	@PostMapping("/post")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Employees postEmployee(@RequestBody Employees emp) {
		
		return esi.postEmployee(emp);
	}

	
	@GetMapping("/get/{id}")
	public Employees getEmployee(@PathVariable Integer id) {
		
		return esi.getEmployee(id);
	}

	
	@PutMapping("/put/{id}")
	public Employees updateEmployee(@PathVariable Integer id,@RequestBody Employees emp) {
		
		return esi.updateEmployee(id, emp) ;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		
		return esi.deleteEmployee(id);
	}
	
}
