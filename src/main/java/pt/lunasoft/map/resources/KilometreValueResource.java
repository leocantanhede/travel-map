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

import pt.lunasoft.map.entities.KilometreValue;
import pt.lunasoft.map.services.KilometreValueService;

@RestController
@RequestMapping("/kilometre-value")
public class KilometreValueResource {

	@Autowired
	private KilometreValueService service;
	
	@PostMapping
	public ResponseEntity<List<KilometreValue>> create(@RequestBody KilometreValue value) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.create(value));
	}
	
	@GetMapping
	public ResponseEntity<List<KilometreValue>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(this.service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<KilometreValue> findById(@PathVariable("id") String id) {
		return ResponseEntity.status(HttpStatus.OK).body(this.service.findById(id));
	}
	
}