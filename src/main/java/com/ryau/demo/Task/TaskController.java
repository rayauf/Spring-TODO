package com.ryau.demo.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/task")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks(){
       return taskService.getTasks();
    }

    @PostMapping
    public void registerTask(@RequestBody Task task){
        taskService.addTask(task);
    }
}
