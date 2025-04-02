package com.ndv.tasks.domain.mappers;

import com.ndv.tasks.domain.dto.TaskListDto;
import com.ndv.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
