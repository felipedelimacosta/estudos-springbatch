package com.example.demo.spring.batch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DadosBancarios {

    @Id
    private Integer id;
    private int pessoaId;
    private int agencia;
    private int conta;
    private int banco;

}
