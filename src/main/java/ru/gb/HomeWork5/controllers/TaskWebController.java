package ru.gb.HomeWork5.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.HomeWork5.models.Task;
import ru.gb.HomeWork5.models.TaskStatus;
import ru.gb.HomeWork5.services.TaskService;

import java.util.List;

@Controller
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskWebController {
    private final TaskService taskService;
    @PostMapping("")
    public String addTask(Task task,Model model){
        taskService.addTask(task);
        List<Task> tasks=taskService.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks.html";
    }
    @GetMapping("")
    public String getAllTasks(Model model){
        List<Task> tasks=taskService.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks.html";

    }
    @GetMapping("/del/{id}")
    public String deleteTask(@PathVariable("id") Long id, Model model){
        taskService.deleteTask(id);
        List<Task> tasks=taskService.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks.html";
    }
    @GetMapping("/status/{status}")
    public String getTaskByStatus(@PathVariable("status") TaskStatus status, Model model){
        List<Task> tasks=taskService.getTaskByStatus(status);
        model.addAttribute("tasks",tasks);
        return "tasks.html";
    }
    @PostMapping("/update")
    public String updateTask(TaskStatus status,Long id,Model model){
        taskService.updateStatus(id,status);
        List<Task> tasks=taskService.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks.html";
    }


}
