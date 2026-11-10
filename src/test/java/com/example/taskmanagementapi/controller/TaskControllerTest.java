
package com.example.taskmanagementapi.controller;

import com.example.taskmanagementapi.dto.Task;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskControllerTest {

    private final TaskController controller = new TaskController();

    @Test
    void shouldReturnThreeTasks() {
        List<Task> tasks = controller.getTasks();

        assertEquals(3, tasks.size());
    }

    @Test
    void shouldReturnCorrectFirstTask() {
        List<Task> tasks = controller.getTasks();

        assertEquals(1L, tasks.get(0).id());
        assertEquals("SMTH", tasks.get(0).title());
        assertTrue(tasks.get(0).completed());
    }

    @Test
    void shouldReturnIncompleteSecondTask() {
        List<Task> tasks = controller.getTasks();

        assertFalse(tasks.get(1).completed());
    }
}
