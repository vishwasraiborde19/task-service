package com.vish.task.controller;

import com.vish.task.model.Task;
import com.vish.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable("id") String id){
        return taskService.getTask(Integer.parseInt(id));
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task){
       return taskService.addTask(task);
    }

    @PutMapping("/tasks")
    public Optional<Task> updateTask(@RequestBody Task task){
        return taskService.updateTask(task);
    }

    @DeleteMapping("/tasks/{id}")
    public Optional<Task> deleteTask(@PathVariable("id") String id){
        return taskService.deleteTask(Integer.parseInt(id));
    }

}
