package ru.gb.HomeWork5.models;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Создайте сущность "пользователи проекта" (UsersProject), которая наследуется от класса "сущность с связью"
 * и будет содержать следующие поля:
 *
 * Идентификатор проекта (projectId) типа Long
 * Идентификатор пользователя (userId) типа Long
 */
@Data
@Entity
@Table(name = "user_project")
public class UserProject extends EntityWithRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "project_id")
    private Long projectId;
    @Column(name="user_id")
    private Long userId;

    public UserProject() {
    }

    public UserProject(Long projectId, Long userId) {
        this.projectId = projectId;
        this.userId = userId;
    }
}
