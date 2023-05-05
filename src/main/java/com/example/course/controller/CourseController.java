package com.example.course.controller;

import com.example.course.repository.CourseEntity;
import com.example.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
  @Autowired
  CourseRepository repository;

  @GetMapping("/courses")
  @CrossOrigin
  public ResponseEntity<List<CourseEntity>> getCourses() {
    return ResponseEntity.ok(repository.findAll());
  }

  @GetMapping("/courses/{name}")
  @CrossOrigin
  public ResponseEntity<CourseEntity> getCourseByName(@PathVariable(value = "name") String name) {
    return ResponseEntity.ok(repository.findById(name).get());
  }
}
