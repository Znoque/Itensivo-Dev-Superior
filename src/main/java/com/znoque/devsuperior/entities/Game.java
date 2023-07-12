package com.znoque.devsuperior.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String Genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;


}
