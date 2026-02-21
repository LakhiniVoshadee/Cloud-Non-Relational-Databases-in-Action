package lk.ijse.eca.cloud_mongo.repository;

import lk.ijse.eca.cloud_mongo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
