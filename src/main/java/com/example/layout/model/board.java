package com.example.layout.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
}