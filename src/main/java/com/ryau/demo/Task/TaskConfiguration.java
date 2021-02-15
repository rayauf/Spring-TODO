package com.ryau.demo.Task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

@Configuration
public class TaskConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(TaskRepository taskRepository){
        return args -> {
            Task firstTask = new Task (
                    "First Task",
                    "Description Task 1",
                    LocalDateTime.of(LocalDate.of(2021, Month.JANUARY,3), LocalTime.of(13,0,0)),
                    LocalDateTime.of(LocalDate.of(2021,Month.JANUARY,5), LocalTime.of(13,30,20)),
                    false
            );

            Task secondTask = new Task (
                    "SecondTask",
                    "Description Task 2",
                    LocalDateTime.of(LocalDate.of(2021, Month.JANUARY,3), LocalTime.of(13,0,0)),
                    LocalDateTime.of(LocalDate.of(2021,Month.JANUARY,5), LocalTime.of(13,30,20)),
                    false
            );
            taskRepository.saveAll(
                    List.of(firstTask,secondTask)
            );
        };
    }
}
