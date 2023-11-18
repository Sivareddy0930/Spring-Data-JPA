package com.Allpackages.EmployeesServices;

import com.Allpackages.EmployeesEntity.Employees;

public interface EmployeesServiceInterface {
	
	public abstract Employees postEmployee(Employees emp);
	public abstract Employees getEmployee(Integer id);
	public abstract Employees updateEmployee(Integer id,Employees emp);
	public abstract String deleteEmployee(Integer id);

}
