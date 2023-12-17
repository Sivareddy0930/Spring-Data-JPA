package com.Allpackages.OrdersRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Allpackages.OrdersEntity.EmployeesOrders;

@Repository
public interface OrdersRepository extends JpaRepository<EmployeesOrders, Integer>{
	

}
