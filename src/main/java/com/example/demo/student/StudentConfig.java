package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, 11, 5)
            );

            Student john = new Student(
                    2L,
                    "John",
                    "johN@gmail.com",
                    LocalDate.of(2001, 2, 8)
            );
            studentRepository.saveAll(List.of(mariam, john));
        };
    }
}
