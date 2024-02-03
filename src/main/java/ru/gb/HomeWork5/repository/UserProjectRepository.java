package ru.gb.HomeWork5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.HomeWork5.models.UserProject;

import java.util.List;

public interface UserProjectRepository extends JpaRepository<UserProject,Long> {
    List<UserProject> findUserProjectByProjectId(Long projectId);
    List<UserProject> findUserProjectByUserId(Long userId);
    List<UserProject> findAllByProjectIdAndUserId(Long projectId,Long userId);
}
