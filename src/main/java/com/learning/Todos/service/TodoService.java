package com.learning.Todos.service;

import com.learning.Todos.models.Todo;
import com.learning.Todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public Page<Todo> getTodosByPage(int page , int size){
        Pageable pageable = PageRequest.of(page,size);
        return todoRepository.findAll(pageable);
    }


    public void TodoDeletebyId(long id) {
        todoRepository.deleteById(id);
    }

}
