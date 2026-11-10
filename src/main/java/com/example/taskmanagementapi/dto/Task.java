package com.example.taskmanagementapi.dto;

public record Task(
        Long id,
        String title,
        boolean completed
) {
}   