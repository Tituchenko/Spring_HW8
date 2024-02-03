package ru.gb.HomeWork5.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.HomeWork5.models.Project;
import ru.gb.HomeWork5.models.User;
import ru.gb.HomeWork5.models.UserProject;
import ru.gb.HomeWork5.repository.ProjectRepository;
import ru.gb.HomeWork5.repository.UserProjectRepository;
import ru.gb.HomeWork5.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Сервисный класс для связующей таблицы пользователь-проект
 */
@Service
@AllArgsConstructor
public class UserProjectService {
    private final UserProjectRepository userProjectRepository;

    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;
    /**
     * метод, возвращающий список пользователей, связанных с определенным проектом
     * @param projectId
     * @return список пользователей
     */
    public List<User> getUsersByProjectId(Long projectId) {
        List<UserProject> userProjectList=userProjectRepository.findUserProjectByProjectId(projectId);
        List<User> users= new ArrayList<>();
        for (UserProject userProject:userProjectList) {
            users.add(userRepository.findById(userProject.getUserId()).get());
        }
        return users;
    }

    /**
     * метод, возвращающий список проектов, связанных с определенным пользователем
     * @param userId
     * @return список проектов
     */
    public List<Project> getProjectsByUserId(Long userId) {
        List<UserProject> userProjectList=userProjectRepository.findUserProjectByUserId(userId);
        List<Project> projects= new ArrayList<>();
        for (UserProject userProject:userProjectList) {
            projects.add(projectRepository.findById(userProject.getProjectId()).get());
        }
        return projects;
    }

    /**
     * метод, добавляющий пользователя к проекту
     * @param userId
     * @param projectId
     */
    public void addUserToProject(Long userId, Long projectId) {
       userProjectRepository.save(new UserProject(projectId,userId));
    }

    /**
     * метод, удаляющий пользователя из проекта
     * @param userId
     * @param projectId
     */
    public void removeUserFromProject(Long userId, Long projectId) {
            userProjectRepository.deleteAll(userProjectRepository.findAllByProjectIdAndUserId(projectId,userId));
    }
}
