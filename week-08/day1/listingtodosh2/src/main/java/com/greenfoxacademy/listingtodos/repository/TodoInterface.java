package com.greenfoxacademy.listingtodos.repository;

import com.greenfoxacademy.listingtodos.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoInterface extends CrudRepository<Todo,Long> {
}
