package com.udemy.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
