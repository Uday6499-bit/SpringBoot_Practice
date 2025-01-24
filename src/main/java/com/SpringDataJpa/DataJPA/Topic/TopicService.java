package com.SpringDataJpa.DataJPA.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    private final List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Core Java", "Core Java Description"),
            new Topic("JavaScript", "JavaScript", "JavaScript Description")
    ));

    // Method to retrieve all topics
    public List<Topic> getAllTopics() {
        List<Topic> topicsFromDb = new ArrayList<>();
        topicRepository.findAll().forEach(topicsFromDb::add); // Populate the list with data from the database
        return topicsFromDb;
    }


    // Method to retrieve a specific topic by id
    public Topic getTopic(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException("Topic not found with id: " + id));
        return topicRepository.findById(id).orElseThrow(() -> new RuntimeException("Topic not found with id: " + id));
    }

    public void addTopic(Topic topic) {
        //topics.add(topic);
        topicRepository.save(topic);

    }


    public void UpdatedTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

}
