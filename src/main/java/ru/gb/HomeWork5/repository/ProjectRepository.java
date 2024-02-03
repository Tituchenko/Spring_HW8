package ru.gb.HomeWork5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.HomeWork5.models.Project;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
