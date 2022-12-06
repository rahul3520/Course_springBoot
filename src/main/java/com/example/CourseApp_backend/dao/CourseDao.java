package com.example.CourseApp_backend.dao;

import com.example.CourseApp_backend.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {


}
