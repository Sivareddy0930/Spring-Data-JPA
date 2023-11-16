package com.Allpackages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Allpackages.EmployeesRepo.EmployeesRepository;
import com.Allpackages.entity.Employees;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	   ConfigurableApplicationContext cxt=SpringApplication.run(Application.class, args);
		
		Employees ref=new Employees();
		ref.setEmp_name("vasu");
		ref.setEmp_salary(100000);
		
		
		EmployeesRepository bean=cxt.getBean(EmployeesRepository.class);
		
		bean.save(ref);
		
		cxt.close();
	}

}
