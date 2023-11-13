package pt.lunasoft.map.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.lunasoft.map.entities.KilometreValue;
import pt.lunasoft.map.repositories.KilometreValueRepository;

@Service
public class KilometreValueService {

	@Autowired
	private KilometreValueRepository repository;
	
	public List<KilometreValue> create(KilometreValue value) {
		this.repository.save(value);
		return this.repository.findAll();
	}
	
	public List<KilometreValue> findAll() {
		return this.repository.findAll();
	}
	
	public KilometreValue findById(String id) {
		return this.repository.findById(id).orElseThrow();
	}
	
}