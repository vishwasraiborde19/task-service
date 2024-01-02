package com.vish.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Table()
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @PrimaryKey
    private int taskId;
    private String taskName;
    private String plannedCompletionDate;
    private Status status;

}
