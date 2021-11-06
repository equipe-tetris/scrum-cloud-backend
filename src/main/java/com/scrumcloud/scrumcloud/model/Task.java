package com.scrumcloud.scrumcloud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="sala_planning")
    private SalaPlanning salaPlanning;

    @Column(name="conteudo", nullable = false)
    private String conteudo;

    @Column(name="data_criacao")
    private LocalDate dataCriacao;

    @Column(name="finalizado")
    private Boolean finalizado;
}
