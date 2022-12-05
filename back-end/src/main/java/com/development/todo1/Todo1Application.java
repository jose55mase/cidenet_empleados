package com.development.todo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class Todo1Application {
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		SpringApplication.run(Todo1Application.class, args);

			emf = Persistence.createEntityManagerFactory("aplicacion");
			manager = emf.createEntityManager();



	}


}
