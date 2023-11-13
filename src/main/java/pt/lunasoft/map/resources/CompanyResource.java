package pt.lunasoft.map.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.lunasoft.map.entities.Company;
import pt.lunasoft.map.services.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyResource {

	@Autowired
	private CompanyService service;
	
	@PostMapping
	public ResponseEntity<List<Company>> create(@RequestBody Company company) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.create(company));
	}
	
	@GetMapping
	public ResponseEntity<List<Company>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(this.service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Company> findById(@PathVariable("id") String id) {
		return ResponseEntity.status(HttpStatus.OK).body(this.service.findById(id));
	}
	
}