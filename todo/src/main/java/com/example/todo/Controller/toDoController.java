package com.example.todo.Controller;

import com.example.todo.Model.Todo;
import com.example.todo.Service.ToDoService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Slf4j
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
      public Todo createToDoApplication(@Valid  @RequestBody Todo todo){
          return toDoService.createToDo(todo);

      }

      @DeleteMapping("/{id}")
      public String deleteToDo(@PathVariable Long id){
          toDoService.deleteToDoById(id);
          log.info("Todo deleted successfully");;
          return "Todo deleted successfully";
      }

      @GetMapping
      public Page<Todo> findToDo(@RequestParam int page,@RequestParam int size){
         return toDoService.findToDo(page,size);

      }

      @GetMapping("/{id}")
      public Optional<Todo> findToDoById(@PathVariable Long id){
          return toDoService.findToDoById(id);

      }


}
