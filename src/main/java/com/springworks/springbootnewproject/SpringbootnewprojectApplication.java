package com.springworks.springbootnewproject;

import com.springworks.springbootnewproject.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringbootnewprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootnewprojectApplication.class, args);
    }

}