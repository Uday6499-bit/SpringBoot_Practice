package com.SpringDataJpa.DataJPA.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses(String topicId) {
        return new ArrayList<>(courseRepository.findByTopicId(topicId));
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Course not found with id: " + id));
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
