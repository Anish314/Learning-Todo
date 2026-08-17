package com.learning.Todos;

import org.springframework.stereotype.Component;

@Component
public class TodoRepository {

    String getAlltodos(){
        return "get all todos";
    }
}
