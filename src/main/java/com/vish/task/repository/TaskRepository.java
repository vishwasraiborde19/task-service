package com.vish.task.repository;

import com.vish.task.model.Task;
import org.springframework.data.cassandra.repository.CassandraRepository;


public interface TaskRepository extends CassandraRepository<Task,Long> {

}
