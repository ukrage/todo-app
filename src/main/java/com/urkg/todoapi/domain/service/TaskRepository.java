package com.urkg.todoapi.domain.service;

import com.urkg.todoapi.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll();

    Optional<Task> findById(Long id);

    void insert(Task task);

    void update(Task task);

    void patch(Task task);

    void delete(Long id);
}
