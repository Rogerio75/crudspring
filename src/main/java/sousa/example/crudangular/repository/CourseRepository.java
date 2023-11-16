package sousa.example.crudangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sousa.example.crudangular.model.Course;

@Repository

public interface CourseRepository extends JpaRepository<Course, Long> {

    
} 
