package com.learning.Todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    //create a object of TodoRepository class
    @Autowired
    private TodoRepository todoRepository;

    //create a constructor to initialize the object of TodoRepository class
    public TodoService(){
        todoRepository = new TodoRepository();
    }

    public void getTodo(){
        System.out.println(todoRepository.getAlltodos());

    }
}
