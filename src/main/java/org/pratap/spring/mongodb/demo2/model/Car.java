package org.pratap.spring.mongodb.demo2.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by orgpratap on 3/23/17.
 */
@Document(collection="cars")
public class Car {
    private String id;
    private String make;
    private String model;
    private String description;
    private Integer year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
