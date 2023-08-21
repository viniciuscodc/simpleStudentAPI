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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student maria = new Student(
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(1999, Month.FEBRUARY, 7)
            );

            repository.saveAll(List.of(maria, john));
        };
    }
}
