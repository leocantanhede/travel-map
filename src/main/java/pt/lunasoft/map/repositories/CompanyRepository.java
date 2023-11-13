package pt.lunasoft.map.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pt.lunasoft.map.entities.Company;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {
	
}