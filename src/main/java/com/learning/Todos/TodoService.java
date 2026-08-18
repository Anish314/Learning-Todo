package com.learning.Todos;

import com.learning.Todos.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    //create a object of TodoRepository class
    @Autowired
    private TodoRepository todoRepository;

    //create a constructor to initialize the object of TodoRepository class\

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo findTodobyId(long id) {
        return todoRepository.findById(id).orElse(null);
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public void TodoDeletebyId(long id) {
        todoRepository.deleteById(id);
    }

}
