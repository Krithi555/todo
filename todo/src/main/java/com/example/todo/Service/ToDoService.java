package com.example.todo.Service;

import com.example.todo.Model.Todo;
import com.example.todo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {
        @Autowired
        ToDoRepository toDoRepository;
        //Todo todo = new Todo();

        public Todo updateToDo(Long id, Todo todo){
            Todo existingTodo = toDoRepository.findById(id).get();
            existingTodo.setTitle(todo.getTitle());
            existingTodo.setCompleted(todo.isCompleted());
            return toDoRepository.save(existingTodo);

        }
        public Todo createToDo(Todo todo1){

            return toDoRepository.save(todo1);

        }

        public List<Todo> findToDo(){
            return toDoRepository.findAll();

         }

    public Optional<Todo> findToDoById(Long id){
        return toDoRepository.findById(id);

    }

         public void deleteToDoById(Long id){
            toDoRepository.deleteById(id);
         }


}
