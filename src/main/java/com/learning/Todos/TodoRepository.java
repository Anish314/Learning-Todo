package com.learning.Todos;

import com.learning.Todos.models.Todo;
import com.sun.jdi.InterfaceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
