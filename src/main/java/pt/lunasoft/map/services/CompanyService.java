package pt.lunasoft.map.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.lunasoft.map.entities.Company;
import pt.lunasoft.map.repositories.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository repository;
	
	public List<Company> create(Company company) {
		this.repository.save(company);
		return this.repository.findAll();
	}
	
	public List<Company> findAll() {
		return this.repository.findAll();
	}
	
	public Company findById(String id) {
		return this.repository.findById(id).orElseThrow();
	}
	
}