package com.vish.task.service;

import com.vish.task.model.Task;

import java.util.List;
import java.util.Optional;


public interface TaskService {

    public Task addTask(Task task);
    public Optional<Task> updateTask(Task task);
    public void deleteTask(int taskID);
    Optional<Task> getTask(int taskID);
    List<Task> getTasks();

}
