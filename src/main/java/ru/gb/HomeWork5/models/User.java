package ru.gb.HomeWork5.models;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Создайте сущность "пользователь" (User), которая будет содержать следующие поля:
 *
 * Идентификатор (id) типа Long, генерируемый автоматически при создании записи
 * Имя пользователя (username) типа String
 * Пароль (password) типа String
 * Электронная почта (email) типа String
 * Роль (role) типа String
 */
@Data
@Entity
@Table(name = "users_my")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="user_name")
    private String userName;
    private String password;
    private String email;
    private String role;
}
