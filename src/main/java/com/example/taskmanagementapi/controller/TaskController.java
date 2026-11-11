package com.example.taskmanagementapi.controller;

import com.example.taskmanagementapi.dto.Task;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public List<Task> getTasks() {
        return List.of(
                new Task(1L, "SMTH", true),
                new Task(2L, "Настроить CI/CD", false),
                new Task(3L, "Do something", false)
        );
    }
}