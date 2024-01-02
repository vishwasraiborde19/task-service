package com.vish.task.service;

import com.vish.task.model.Status;
import com.vish.task.model.Task;
import com.vish.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TaskImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;


    /**
     * @param task
     * @return
     */
    @Override
    public Task addTask(Task task) {
        taskRepository.save(task);
        return task;
    }

    /**
     * @param task
     * @return
     */
    @Override
    public Optional<Task> updateTask(Task task) {
        return Optional.of(taskRepository.save(task));
    }

    /**
     * @param taskID
     */
    @Override
    public void deleteTask(int taskID) {
         taskRepository.delete(new Task(taskID,null,null,null));
    }

    /**
     * @param taskID
     * @return
     */
    @Override
    public Optional<Task> getTask(int taskID) {
        return taskRepository.findById(Long.valueOf(taskID));
    }

    /**
     * @return
     */
    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }
}
