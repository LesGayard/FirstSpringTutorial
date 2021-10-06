package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Tells Spring that the class is a bean
@Component
//@Service is more precise for that case, this class is service class for Spring
@Service
public class StudentService {

    public List<Student> getStudents(){

        return List.of( new Student(
                1L,"Bob",21, LocalDate.of(2000, Month.JANUARY,12),"bob@gmail.com"
        )) ;

    }
}
