package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Student;
import com.app.repo.DataBaseRepository;
@Component
public class DataRunner implements CommandLineRunner {
	@Autowired
	private DataBaseRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.findAll().forEach(System.out::println);
	}

}
