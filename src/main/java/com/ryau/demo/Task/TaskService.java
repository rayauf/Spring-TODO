package com.ryau.demo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks(){
        return taskRepository.findAll();
    }

    public void addTask(Task task) {
        Optional<Task> taskByTitle = taskRepository.findTaskByTitle(task.getTitle());
        if(taskByTitle.isPresent()){
            throw new IllegalStateException("Task already exist");
        }
        taskRepository.save(task);
    }
}
