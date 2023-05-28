package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.naming.SelfNaming;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student alperen = new Student(
                    "Alperen",
                    "alperenc@gmail.com",
                    LocalDate.of(2002, Month.MAY, 18)

            );
            Student sena = new Student(
                    "Sena",
                    "Sena@gmail.com",
                    LocalDate.of(2002, Month.MAY, 06)
            );

            repository.saveAll(List.of(alperen,sena));
        };
    }
}
