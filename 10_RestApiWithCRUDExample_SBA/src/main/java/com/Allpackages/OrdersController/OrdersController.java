package com.Allpackages.OrdersController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Allpackages.OrdersEntity.EmployeesOrders;
import com.Allpackages.OrdersServices.OrdersServiceImple;

@RestController
public class OrdersController {
	@Autowired
	OrdersServiceImple osi;
	
	@PostMapping("/post")
	@ResponseStatus(code=HttpStatus.CREATED)
	public EmployeesOrders postOrders(@RequestBody EmployeesOrders eod) {
		return osi.postOrders(eod);
		
	}
	
	@GetMapping("/get/{id}")
	public EmployeesOrders getOrders(@PathVariable Integer id ) {
		return osi.getOrders(id);
	}
	
	@PutMapping("/update/{id}")
	public EmployeesOrders updateOrders(@PathVariable Integer id ,@RequestBody EmployeesOrders eod) {
		return osi.updateOrders(id, eod);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteOrders(@PathVariable Integer id) {
		return osi.deleteOrders(id);
	}
	
	@GetMapping("/getAll")
	public List getAll() {
		return osi.FindAll();
		
	}
	
	@PostMapping("/putAll")
	@ResponseStatus(code=HttpStatus.CREATED)
	public String putAll(@RequestBody List<EmployeesOrders> empl ) {
		return osi.saveAllEmployees(empl);
		
	}
	
	@GetMapping("/count")
	public Long countEmployees() {
		return osi.countEmployees();
	}
	
	@GetMapping("/checkExistance/{id}")
	public Boolean existOrNot(@PathVariable Integer id) {
		return osi.existOrNot(id);
		
	}
	
}
