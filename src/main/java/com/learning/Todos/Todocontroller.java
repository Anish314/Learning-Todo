package com.learning.Todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todos")
public class Todocontroller {

    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    String getTodo() {
        todoService.getTodo();
        return "Todo";
    }

    //pathvariable is used to get the value from the url
    @GetMapping("/{id}")
        String getTodobyId(@PathVariable long id) {
        return "my id is " + id;
    }

    //RequestParam is used to get the value from the url
    @GetMapping
    String getTodobyIdval(@RequestParam("todoid") long id) {
        return "my id is " + id;
    }

    //Request body is to share the body without any val in the url
    @PostMapping("/create")
    String cretetodobyId(@RequestBody String body){
        return body;
    }

    @PutMapping("/{id}")
    String updateTodobyId(@PathVariable long id){
        return "update todo by id " + id;
    }

    @DeleteMapping("/{id}")
    String deleteTodobyId(@PathVariable long id){
        return "Delete todo by id " + id;
    }



}
