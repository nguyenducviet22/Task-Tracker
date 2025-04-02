package com.ndv.tasks.domain.mappers;

import com.ndv.tasks.domain.dto.TaskDto;
import com.ndv.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
