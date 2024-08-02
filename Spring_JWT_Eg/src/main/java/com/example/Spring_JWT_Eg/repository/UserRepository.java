package com.example.Spring_JWT_Eg.repository;

import com.example.Spring_JWT_Eg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}