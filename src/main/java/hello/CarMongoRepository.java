package hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface CarMongoRepository extends MongoRepository<Car, String> {

}
