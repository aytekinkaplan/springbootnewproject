package com.springworks.springbootnewproject.student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "John", "Doe", LocalDate.of(2000, 1, 1), 20),
                new Student(2L, "Jane", "Doe", LocalDate.of(2001, 1, 1), 21),
                new Student(3L, "Jack", "Doe", LocalDate.of(2002, 1, 1), 22),
                new Student(4L, "Jill", "Doe", LocalDate.of(2003, 1, 1), 23)
        );
    }
}
