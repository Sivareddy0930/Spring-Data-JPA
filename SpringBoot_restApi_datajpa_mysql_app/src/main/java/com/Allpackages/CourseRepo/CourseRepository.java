package com.Allpackages.CourseRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Allpackages.Entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
