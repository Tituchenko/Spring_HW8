package ru.gb.HomeWork5.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Создайте абстрактный класс "сущность с связью" (EntityWithRelation), который будет содержать следующие поля:
 *
 * Идентификатор (id) типа Long, генерируемый автоматически при создании записи
 * Идентификатор связанной сущности (relatedEntityId) типа Long
 */
public abstract class EntityWithRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long relatedEntityId; //бесполезное поле, но в задании сказано его создать.
    // Потому что свзяваемые поля имеют конкретные имена в названии
}
