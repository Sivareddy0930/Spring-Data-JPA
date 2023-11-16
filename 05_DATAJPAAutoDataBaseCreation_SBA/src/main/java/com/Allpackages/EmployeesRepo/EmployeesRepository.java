package com.Allpackages.EmployeesRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Allpackages.entity.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

}
