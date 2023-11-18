package com.Allpackages.EmployeesServices;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Allpackages.EmployeesEntity.Employees;
import com.Allpackages.EmployeesRepo.EmployeesRepository;

@Service
public class EmployeesServiceImple implements EmployeesServiceInterface {
	
	@Autowired
	EmployeesRepository erp;
	
	@Override
	public Employees postEmployee(Employees emp) {
		
		return erp.save(emp);
	}

	@Override
	public Employees getEmployee(Integer id) {
		
		return erp.findById(id).get();
	}

	@Override
	public Employees updateEmployee(Integer id,Employees emp) {
		Employees e= erp.findById(id).get();
		
		if(Objects.nonNull(emp.getName()) && !"".equalsIgnoreCase(emp.getName())) {
			
			e.setName(emp.getName());
		}
		if(Objects.nonNull(emp.getSalary()) && !"".equalsIgnoreCase((emp.getSalary()).toString())) {
			
			e.setSalary(emp.getSalary());
		
		}
		
		
		return erp.save(e);
	}

	@Override
	public String deleteEmployee(Integer id) {
		erp.deleteById(id);
		return "Deleted Successfully";
	}

}
