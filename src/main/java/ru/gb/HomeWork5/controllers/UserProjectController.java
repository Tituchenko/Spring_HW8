package ru.gb.HomeWork5.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.HomeWork5.models.UserProject;
import ru.gb.HomeWork5.services.UserProjectService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user_project")
public class UserProjectController {
    private final UserProjectService userProjectService;

    /**
     * метод, обрабатывающий GET-запрос для получения списка пользователей, связанных с определенным проектом
     * @param projectId
     * @return список пользователей на проекте
     */
    @GetMapping("/project/{projectId}")
    public ResponseEntity<List> getUsersByProjectId(@PathVariable Long projectId) {
       return new ResponseEntity<>(userProjectService.getUsersByProjectId(projectId), HttpStatus.OK);
    }

    /**
     * метод, обрабатывающий GET-запрос для получения списка проектов, связанных с определенным пользователем
     * @param userId
     * @return список проектов
     */
    @GetMapping("/user/{userId}")
    public ResponseEntity<List> getProjectsByUserId(@PathVariable Long userId){
        return new ResponseEntity<>(userProjectService.getProjectsByUserId(userId), HttpStatus.OK);
    }

    /**
     * метод, обрабатывающий POST-запрос для добавления пользователя к проекту
     * @param userId
     * @param projectId
     * @return
     */
    @PostMapping("/add/{userId}/{projectId}")
    public ResponseEntity addUserToProject(@PathVariable Long userId, @PathVariable Long projectId) {
            userProjectService.addUserToProject(userId,projectId);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     *  метод, обрабатывающий POST-запрос для удаления пользователя из проекта
     * @param userId
     * @param projectId
     * @return
     */
    @PostMapping("/del/{userId}/{projectId}")
    public ResponseEntity removeUserFromProject(@PathVariable Long userId, @PathVariable Long projectId){
        userProjectService.removeUserFromProject(userId,projectId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
