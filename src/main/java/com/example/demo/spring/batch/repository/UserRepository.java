package com.example.demo.spring.batch.repository;

import com.example.demo.spring.batch.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Pessoa,Integer> {
}
