package pt.lunasoft.map.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pt.lunasoft.map.entities.KilometreValue;

@Repository
public interface KilometreValueRepository extends MongoRepository<KilometreValue, String> {

}