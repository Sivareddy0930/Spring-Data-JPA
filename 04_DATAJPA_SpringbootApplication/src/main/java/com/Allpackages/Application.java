package com.Allpackages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Allpackages.entities.ContactsMasterEntity;
import com.Allpackages.repositories.ContactsMasterRepo;



@SpringBootApplication
public class Application {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext cxt= SpringApplication.run(Application.class, args);
		
		  ContactsMasterRepo bean= cxt.getBean(ContactsMasterRepo.class);
//		  System.out.println(bean);
		
		ContactsMasterEntity entity=new ContactsMasterEntity();
		
		entity.setContactId(102);
		entity.setContactName("Vamsi");
		entity.setContactNumber(1236);
		
		bean.save(entity);
		
		cxt.close();
		  
		
		}
	
	}


