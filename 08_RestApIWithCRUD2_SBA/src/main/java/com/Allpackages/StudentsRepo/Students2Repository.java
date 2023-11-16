package com.Allpackages.StudentsRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.Allpackages.entity.Students2;
import java.util.List;



@Repository
public interface Students2Repository extends JpaRepository<Students2, Integer> {
		
	
	List<Students2> findByName(String name);
	
	
}
