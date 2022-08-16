package com.example.usermanager.repo;

import com.example.usermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    void deleteUserById(Long id);
    User findUserByUsername(String username);
    Optional<User> findUserById(Long id);
}
