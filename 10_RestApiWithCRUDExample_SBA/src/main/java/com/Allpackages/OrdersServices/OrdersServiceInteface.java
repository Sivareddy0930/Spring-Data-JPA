package com.Allpackages.OrdersServices;

import java.util.List;

import com.Allpackages.OrdersEntity.EmployeesOrders;

public interface OrdersServiceInteface {
	public abstract EmployeesOrders postOrders(EmployeesOrders eod);
	public abstract EmployeesOrders getOrders(Integer oid);
	public abstract EmployeesOrders updateOrders(Integer oid,EmployeesOrders eod);
	public abstract String deleteOrders(Integer oid);
	public abstract List FindAll();
	public abstract String saveAllEmployees(List<EmployeesOrders> empl);
	public abstract Long countEmployees();
	public abstract Boolean existOrNot(Integer oid);
	public abstract String deleteAll();
	
	
}
