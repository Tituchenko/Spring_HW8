package ru.gb.HomeWork5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.HomeWork5.models.Task;
import ru.gb.HomeWork5.models.TaskStatus;

import java.util.List;
import java.util.Optional;

/**
 * Репозиторий задач
 */
@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findByStatus(TaskStatus status);
}
