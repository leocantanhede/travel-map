package pt.lunasoft.map.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.lunasoft.map.entities.TravelRecord;
import pt.lunasoft.map.services.TravelRecordService;

@RestController
@RequestMapping("/travel")
public class TravelRecordResource {
	
	@Autowired
	private TravelRecordService service;
	
	@PostMapping
	public ResponseEntity<List<TravelRecord>> create(@RequestBody TravelRecord record) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.create(record));
	}
	
	@GetMapping
	public ResponseEntity<List<TravelRecord>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(this.service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TravelRecord> findById(@PathVariable("id") String id) {
		return ResponseEntity.status(HttpStatus.OK).body(this.service.findById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") String id) {
		this.service.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
}