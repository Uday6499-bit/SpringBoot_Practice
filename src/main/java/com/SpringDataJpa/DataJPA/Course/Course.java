package com.SpringDataJpa.DataJPA.Course;

import com.SpringDataJpa.DataJPA.Topic.Topic;  // Import the Topic class

public class Course {
    private Long id;
    private String name;
    private Topic topic;  // Correctly referencing the Topic class

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
