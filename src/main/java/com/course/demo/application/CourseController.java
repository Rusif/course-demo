package com.course.demo.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CourseController {

    @GetMapping("")
    public String getAppRoot() {
        return "Course  REST API";
    }
}
