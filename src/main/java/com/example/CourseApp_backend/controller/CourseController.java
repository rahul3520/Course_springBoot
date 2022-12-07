package com.example.CourseApp_backend.controller;

import com.example.CourseApp_backend.dao.CourseDao;
import com.example.CourseApp_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> addCourse(@RequestBody Course c)
    {
        HashMap<String,String> map=new HashMap<>();

        System.out.println(c.toString());
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());
        System.out.println(c.getCourseVenue().toString());

        dao.save(c);

        map.put("status","success");

        return map;
    }

    @CrossOrigin(origins="*")
    @GetMapping("/view")
    public List<Course> viewCourse()
    {
        return (List<Course>) dao.findAll();
    }


}
