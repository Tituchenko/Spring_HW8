package ru.gb.HomeWork5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.HomeWork5.models.User;
import ru.gb.HomeWork5.models.UserProject;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

}
