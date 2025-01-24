package com.SpringDataJpa.DataJPA.Topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Default constructor for JPA
    public Topic() {}
}

