package com.example.todo;

import com.example.todo.Model.Todo;
import com.example.todo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {


	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);

	}

}
