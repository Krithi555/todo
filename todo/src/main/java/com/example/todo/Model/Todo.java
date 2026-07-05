package com.example.todo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
public class Todo {

    @GeneratedValue
    @Id
    private Long id;

    @NotBlank(message = "title cannot be blank")
    @Size(min=3, max=100, message="title cannot be less than 3 character and more than 100 character" )
    private String title;

    private boolean isCompleted;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Long getId() {
        return id;
    }
}
