package com.springworks.springbootnewproject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "meriam@example.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@example.com",
                    LocalDate.of(2004, Month.MARCH, 5)
            );

            Student sam = new Student(
                    "Sam",
                    "sam@example.com",
                    LocalDate.of(2002, Month.DECEMBER, 6)
            );

            Student peter = new Student(
                    "Peter",
                    "peter@example.com",
                    LocalDate.of(2001, Month.JANUARY, 5)
            );

            Student john = new Student(
                    "John",
                    "john@example.com",
                    LocalDate.of(2003, Month.MARCH, 5)
            );

            studentRepository.saveAll(List.of(mariam, alex, sam, peter, john));

        };
    }
}
