package ru.gb.HomeWork5.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.HomeWork5.models.Task;
import ru.gb.HomeWork5.models.TaskStatus;
import ru.gb.HomeWork5.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    /**
     * Создать задачу
     * @param task
     * @return task
     */
    public Task addTask(Task task){
//        task.setCreateDate();
        return taskRepository.save(task);
    }

    public Task getTask(Long id){
        return taskRepository.findById(id).get();
    }

    public void updateStatus(Long id,TaskStatus status){
        Task task=getTask(id);
        task.setStatus(status);
        taskRepository.save(task);
    }

    /**
     * Получить все задачи
     * @return список задач
     */
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

    public List<Task> getTaskByStatus(TaskStatus status){
        return taskRepository.findByStatus(status);
    }



}
