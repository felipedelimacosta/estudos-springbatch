package com.example.demo.spring.batch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    @Id
    private Integer id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private Integer idade;


}
