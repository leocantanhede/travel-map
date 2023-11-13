package pt.lunasoft.map.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import pt.lunasoft.map.entities.Address;

public interface AddressRepository extends MongoRepository<Address, String> {

}