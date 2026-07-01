package com.example.todo.Repository;

import com.example.todo.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<Todo,Long>{

}