package com.veras.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter //Gera os Getters
@Setter //Gera os Setters
@AllArgsConstructor //Gera o construtor
public class User {
    private String name;
    private String email;
}
