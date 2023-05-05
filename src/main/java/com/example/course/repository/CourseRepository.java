package com.example.course.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<CourseEntity, String> {
  @Override
  List<CourseEntity> findAll();
}
