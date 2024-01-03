create table task
(
    taskId                int primary key,
    taskName              TEXT,
    plannedCompletionDate UUID,
    status                TEXT
);