package com.vish.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private int taskId;
    private String taskName;
    private Date plannedCompletionDate;
    private Status status;
}
