package ru.gb.HomeWork5.models;


import lombok.Data;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Класс задача
 * Структура задачи(класс Task):
 * - ID (автоинкрементное)(тип Long)
 * - Описание (не может быть пустым)(тип String)
 * - Статус (одно из значений: "не начата", "в процессе", "завершена")(Тип TaskStatus )
 * - Дата создания (автоматически устанавливается при создании задачи)(Тип LocalDateTime)
 */
@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String description;
    private TaskStatus status;
    private LocalDateTime createDate=LocalDateTime.now();

    public String getFormattedCreateDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        return createDate.format(formatter);

    }
}
