package com.ryau.demo.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

@Service
public class TaskService {

    public List<Task> getTasks(){
        return List.of(
                new Task(1L,
                        "Title 1",
                        "Description Task 1",
                        LocalDateTime.of(LocalDate.of(2021, Month.JANUARY,3), LocalTime.of(13,0,0)),
                        LocalDateTime.of(LocalDate.of(2021,Month.JANUARY,5), LocalTime.of(13,30,20)),
                        false
                )
        );
    }
}
