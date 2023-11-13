package pt.lunasoft.map.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.lunasoft.map.entities.Employee;
import pt.lunasoft.map.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> create(Employee employee) {
		this.repository.save(employee);
		return this.repository.findAll();
	}
	
	public List<Employee> findAll() {
		return this.repository.findAll();
	}
	
	public Employee findById(String id) {
		return this.repository.findById(id).orElseThrow();
	}
	
}