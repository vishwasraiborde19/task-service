package com.vish.task.service;

import com.vish.task.model.Status;
import com.vish.task.model.Task;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TaskImpl implements TaskService {
    private static Map<Integer,Task> taskData =  new HashMap<>();
    static {
        taskData.put(10,new Task(10,"completed job 1",null, Status.COMPLETED)) ;
        taskData.put(11,new Task(11,"completed job 2",null, Status.COMPLETED)) ;
        taskData.put(12,new Task(12,"completed job 3",null, Status.COMPLETED)) ;
        taskData.put(13,new Task(13,"completed job 4",null, Status.COMPLETED)) ;
    }

    /**
     * @param task
     * @return
     */
    @Override
    public Task addTask(Task task) {
        return taskData.put(task.getTaskId(),task);
    }

    /**
     * @param task
     * @return
     */
    @Override
    public Optional<Task> updateTask(Task task) {
        if(taskData.containsKey(task.getTaskId())){
            taskData.remove(task.getTaskId());
            taskData.put(task.getTaskId(), task);
            return Optional.of(taskData.get(task.getTaskId()));
        }  else {
            return Optional.empty();
        }
    }

    /**
     * @param taskID
     * @return
     */
    @Override
    public Optional<Task> deleteTask(int taskID) {
        if(taskData.containsKey(taskID)) {
            taskData.remove(taskID);
        }
        return Optional.empty();
    }

    /**
     * @param taskID
     * @return
     */
    @Override
    public Task getTask(int taskID) {
        return taskData.get(taskID);
    }

    /**
     * @return
     */
    @Override
    public List<Task> getTasks() {
        return new ArrayList<>(taskData.values());
    }
}
