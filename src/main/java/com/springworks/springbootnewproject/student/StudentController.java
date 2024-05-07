package com.springworks.springbootnewproject.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L, "Jill", "X9ZtX@example.com", LocalDate.of(2000, 8, 30), 23
                )
                , new Student(
                        1L, "Jack", "X9ZtX@example.com", LocalDate.of(2000, 8, 30), 23
                )
        );
    }

}
