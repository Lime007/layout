package com.example.layout.repository;

import com.example.layout.model.board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<board, Long> {
    List<board> findAll();
}