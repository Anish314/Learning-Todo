package com.learning.Todos.repository;

import com.learning.Todos.models.Todo;
import com.learning.Todos.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {


}
