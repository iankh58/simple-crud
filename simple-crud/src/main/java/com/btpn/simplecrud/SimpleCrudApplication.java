package com.btpn.simplecrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.btpn.persistence.CrudRepository;
import com.btpn.simplecrud.model.Crud;

@Import({SpringConfig.class})
@EnableJpaRepositories({"com.btpn.persistence"})
@SpringBootApplication
public class SimpleCrudApplication implements CommandLineRunner {
	@Autowired
    private CrudRepository crudRepo;

	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudApplication.class, args);
		System.out.println("Hello World");
	}

	@Override
	public void run(String... arg0) throws Exception {
		 crudRepo.save(new Crud("A1", "Hello World 1"));
         crudRepo.save(new Crud("A2", "Hello World 2"));
         crudRepo.save(new Crud("A3", "Hello World 3"));
         crudRepo.save(new Crud("A4", "Hello World 4"));
	}

}
