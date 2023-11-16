package sousa.example.crudangular;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sousa.example.crudangular.model.Course;
import sousa.example.crudangular.repository.CourseRepository;

@SpringBootApplication
public class CrudAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAngularApplication.class, args);
	}

@Bean
CommandLineRunner initDatabase(CourseRepository courseRepository){
  return arg -> {
    courseRepository.deleteAll();
	Course c = new Course();
	c.setName("Angular Com spring");
	c.setCategory("Front-Pica");
    courseRepository.save(c);
  };

}


}
