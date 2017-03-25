package org.pratap.spring.mongodb.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by orgpratap on 3/23/17.
 */
@SpringBootApplication
@EnableMongoRepositories("org.pratap.spring.mongodb.demo2.repository")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
