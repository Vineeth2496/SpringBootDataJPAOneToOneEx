package com.SpringBootJDataJPA.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Employee;
import com.SpringBootJDataJPA.repo.EmployeeRepository;
@Component
public class DataFetchRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository erepo;
	@Override
	public void run(String... args) throws Exception {
			Employee e=erepo.findById(1).get();
			System.out.println("DONE");
			
	}

}
