package com.example.todo.Controller;

import com.example.todo.Model.Todo;
import com.example.todo.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class toDoController {
      @Autowired
      ToDoService toDoService;


     @PutMapping("/{id}")
      public Todo updatetodoApp(@PathVariable Long id,@RequestBody Todo todo){
          return toDoService.updateToDo(id,todo);

      }

      @PostMapping
      public Todo createToDoApplication(@RequestBody Todo todo){
          return toDoService.createToDo(todo);

      }

      @DeleteMapping("/{id}")
      public String deleteToDo(@PathVariable Long id){
          toDoService.deleteToDoById(id);
          return "Todo deleted successfully";
      }

      @GetMapping
      public List<Todo> findToDo(){
         return toDoService.findToDo();

      }

      @GetMapping("/{id}")
      public Optional<Todo> findToDoById(@PathVariable Long id){
          return toDoService.findToDoById(id);

      }


}
