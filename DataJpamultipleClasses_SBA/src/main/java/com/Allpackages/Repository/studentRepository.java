package com.Allpackages.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Allpackages.Entity.Student;


@Repository
public interface studentRepository extends JpaRepository<Student,Long> {

}
