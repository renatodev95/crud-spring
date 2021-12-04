package com.renato;

import com.renato.model.Course;
import com.renato.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringApplication implements CommandLineRunner {

	@Autowired
	private final CourseRepository courseRepository;

	public CrudSpringApplication(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}


	@Override
	public void run(String... args) {
		Course c = new Course();
		c.setName("Angular com Spring");
		c.setCategory("front-end");

		courseRepository.save(c);
	}
}
