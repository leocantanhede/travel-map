package pt.lunasoft.map.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.lunasoft.map.entities.TravelRecord;
import pt.lunasoft.map.repositories.TravelRecordRepository;

@Service
public class TravelRecordService {

	@Autowired
	private TravelRecordRepository repository;
	
	public List<TravelRecord> create(TravelRecord record) {
		this.repository.save(record);
		return this.repository.findAll();
	}
	
	public List<TravelRecord> findAll() {
		return this.repository.findAll();
	}
	
	public TravelRecord findById(String id) {
		return this.repository.findById(id).orElseThrow();
	}
	
	public void delete(String id) {
		this.repository.deleteById(id);
	}
	
}