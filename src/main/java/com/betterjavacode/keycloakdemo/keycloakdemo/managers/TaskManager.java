package com.betterjavacode.keycloakdemo.keycloakdemo.managers;

import com.betterjavacode.keycloakdemo.keycloakdemo.dto.TaskDto;
import com.betterjavacode.keycloakdemo.keycloakdemo.models.Task;
import com.betterjavacode.keycloakdemo.keycloakdemo.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TaskManager
{
    @Autowired
    private TaskRepository taskRepository;

    public TaskDto createTask(TaskDto taskDto)
    {
        return null;
    }

    public TaskDto getTask(int id)
    {
        Optional<Task> task = taskRepository.findById(id);
        if(task.isPresent())
        {
            return new TaskDto(task.get());
        }
        else
        {
            return null;
        }
    }

    public List<TaskDto> getAllTasks()
    {
        List<Task> tasks = (List<Task>) taskRepository.findAll();
        List<TaskDto> taskDtos = new ArrayList<>();
        for(Task task: tasks)
        {
            taskDtos.add(new TaskDto(task));
        }
        return taskDtos;
    }
}
