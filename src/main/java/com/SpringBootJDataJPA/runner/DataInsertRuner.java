package com.SpringBootJDataJPA.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Employee;
import com.SpringBootJDataJPA.model.Profile;
import com.SpringBootJDataJPA.repo.EmployeeRepository;
import com.SpringBootJDataJPA.repo.ProfileRepository;
//@Component
public class DataInsertRuner implements CommandLineRunner {
	@Autowired
	private ProfileRepository prepo;
	@Autowired
	private EmployeeRepository erepo;
	@Override
	public void run(String... args) throws Exception {
		Profile p1=new Profile(10, "PER", 8.5, 15.9);
		Profile p2=new Profile(11, "PET", 5.5, 10.6);
		Profile p3=new Profile(12, "PTH", 8.0, 12.0);
		
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
		
		Employee e1=new Employee(1, "SAM", "DEV", p1);
		Employee e2=new Employee(2, "SYED", "BA", p2);
		Employee e3=new Employee(3, "JAI", "QA", p3);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
	}

}
