package sousa.example.crudangular.controller;
import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sousa.example.crudangular.model.Course;
import sousa.example.crudangular.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
@Component
@AllArgsConstructor
public class CourseController {
   
    private final CourseRepository courseRepository;
   
   
   
    @GetMapping 

public List<Course> list() {

   return courseRepository.findAll();

}

}
