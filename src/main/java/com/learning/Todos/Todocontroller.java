package com.learning.Todos;

import com.learning.Todos.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class Todocontroller {

    @Autowired
    private TodoService todoService;


    //pathvariable is used to get the value from the url
    @GetMapping("/{id}")
        ResponseEntity<Todo> getTodobyId(@PathVariable long id) {
        return new ResponseEntity<>(todoService.findTodobyId(id), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<Todo>> getAllTodos() {
        return new ResponseEntity<List<Todo>>(todoService.getAllTodos(), HttpStatus.OK);
    }
    //Request body is to share the body without any val in the url
    @PostMapping("/create")
    ResponseEntity<Todo> cretetodobyId(@RequestBody Todo todo){
        return new ResponseEntity<>(todoService.createTodo(todo), HttpStatus.CREATED);
    }

    @PutMapping
    ResponseEntity<Todo> updateTodobyId(@RequestBody Todo todo){
        return new ResponseEntity<>(todoService.updateTodo(todo) , HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteTodobyId(@PathVariable long id){
        todoService.TodoDeletebyId(id);
    }

}
