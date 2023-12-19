package com.Allpackages.Repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Allpackages.Entity.Guardian;
import com.Allpackages.Entity.Student;


@SpringBootTest

class studentRepositoryTest {

	@Autowired
	private studentRepository sr;
	
//	@Test
//	public void saveStudent() {
//		Student st=new Student();
//				st.setFirstName("siva reddy");
//				st.setLastName("tumu");
//				st.setEmailId("siva@gamil.com");
////				st.setGuardianName("vamsi");
////				st.setGuardianEmail("vamsi@gamil.com");
////				st.setGuardianMobile("98661236");
//				
//			sr.save(st);
//		
//	}
//	
	@Test
	public void saveStudentWithGuardian() {
		Guardian g=Guardian.builder()
				.name("guru")
				.email("guru@gamil.com")
				.mobile("12345678")
				.build();
		
		Student st1=Student.builder()
				.firstName(" venkata siva reddy")
				.lastName("tumu")
				.emailId("venaktasivareddy@gamil.com")
				.guardian(g)
				.build();
		
		
		sr.save(st1);
		
	}
	
	@Test
	public void printAllStudent() {
		List<Student> studentList=sr.findAll();
		System.out.println("students list in table:-"+studentList);
	}

}
