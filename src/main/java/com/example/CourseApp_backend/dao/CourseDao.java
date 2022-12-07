package com.example.CourseApp_backend.dao;

import com.example.CourseApp_backend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {

    @Query(value = "SELECT `id`, `course_date`, `course_description`, `course_duration`, `course_title`, `course_venue` FROM `courses` WHERE `course_title` LIKE %:courseTitle%",nativeQuery = true)
    List<Course> search(@Param("courseTitle") String courseTitle);

}
