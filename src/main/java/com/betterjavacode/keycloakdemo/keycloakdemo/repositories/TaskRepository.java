package com.betterjavacode.keycloakdemo.keycloakdemo.repositories;

import com.betterjavacode.keycloakdemo.keycloakdemo.models.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer>
{
}
