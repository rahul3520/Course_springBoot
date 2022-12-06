package com.example.CourseApp_backend.controller;

import com.example.CourseApp_backend.model.Course;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @PostMapping(path = "/add",produces = "application/json",consumes = "application/json")
    public String addStudent(@RequestBody Course c)
    {
        System.out.println(c.toString());
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());
        System.out.println(c.getCourseVenue().toString());

        return "add course page";
    }


}
