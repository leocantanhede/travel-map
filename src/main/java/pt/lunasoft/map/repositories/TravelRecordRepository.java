package pt.lunasoft.map.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pt.lunasoft.map.entities.TravelRecord;

@Repository
public interface TravelRecordRepository extends MongoRepository<TravelRecord, String> {

}