package com.example.demo.spring.batch.repository;

import com.example.demo.spring.batch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Integer> {
}
