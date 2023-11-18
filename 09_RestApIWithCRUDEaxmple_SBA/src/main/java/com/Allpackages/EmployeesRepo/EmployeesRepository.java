package com.Allpackages.EmployeesRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Allpackages.EmployeesEntity.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

}
