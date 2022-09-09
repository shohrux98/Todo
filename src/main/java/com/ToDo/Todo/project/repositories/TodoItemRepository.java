package com.ToDo.Todo.project.repositories;

import com.ToDo.Todo.project.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}
