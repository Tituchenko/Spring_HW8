package ru.gb.HomeWork5.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Создайте сущность "проект" (Project), которая будет содержать следующие поля:
 *
 * Идентификатор (id) типа Long, генерируемый автоматически при создании записи
 * Название проекта (name) типа String
 * Описание проекта (description) типа String
 * Дата создания (createdDate) типа LocalDate
 */
@Data
@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Column(name="created_date")
    private LocalDate createdDate=LocalDate.now();
    public String getFormattedCreateDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        return createdDate.format(formatter);

    }
}
