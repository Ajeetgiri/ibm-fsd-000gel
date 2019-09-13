package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.ContractEmployee;
import com.example.demo.entity.Employee;
import com.example.demo.entity.PermanentEmployee;
import com.example.demo.respository.ContractEmployeeRepository;
import com.example.demo.respository.EmployeeRepository;
import com.example.demo.respository.PermanentEmployeeRepository;

@Component
public class Service implements ApplicationListener<ContextRefreshedEvent> {
	
	private ContractEmployeeRepository contractEmployeerepository;
	private PermanentEmployeeRepository permanentEmployeeRepository;
	private EmployeeRepository employeeRepository;
	
	
	public Service(ContractEmployeeRepository contractEmployeerepository,
			PermanentEmployeeRepository permanentEmployeeRepository, EmployeeRepository employeeRepository) {
		super();
		this.contractEmployeerepository = contractEmployeerepository;
		this.permanentEmployeeRepository = permanentEmployeeRepository;
		this.employeeRepository = employeeRepository;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}
	
	private void init() {
		
		Employee e = new Employee("Ajeet","Giri","ajeetgiri.giri@gmail.com");
		employeeRepository.save(e);
		PermanentEmployee p = new PermanentEmployee("Ram","Murti","ram@gmail.com",50000);
		permanentEmployeeRepository.save(p);
		ContractEmployee c = new ContractEmployee("Sobesh","Barun","sobhesh@gmail.com",5000,5);
		contractEmployeerepository.save(c);
		
		
	}
	
	
	


}
