package com.example.newtodo.controller;

import com.example.newtodo.model.Todo;
import com.example.newtodo.repository.TodoRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("todos", todoRepository.findAll());

        return "index";
    }

    @PostMapping("/todos")
    public String addTask(@RequestParam String task) {

        Todo todo = new Todo();
        todo.setTask(task);

        todoRepository.save(todo);

        return "redirect:/";
    }
}