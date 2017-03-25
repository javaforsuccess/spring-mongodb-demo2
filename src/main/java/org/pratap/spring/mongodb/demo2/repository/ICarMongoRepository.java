package org.pratap.spring.mongodb.demo2.repository;

import org.pratap.spring.mongodb.demo2.model.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by orgpratap on 3/23/17.
 */
public interface ICarMongoRepository extends CrudRepository<Car,String> {
}
