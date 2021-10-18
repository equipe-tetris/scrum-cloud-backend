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
@Table(name = "sala_planning")
public class SalaPlanning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="nome", nullable = false)
    private String nome;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="scrum_master")
    private Usuario scrumMaster;

    @Column(name="data_criacao")
    private LocalDate dataCriacao;

    @Column(name="metrica_sala", nullable = false)
    private String metricaSala;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="equipe")
    private Equipe equipe;
}
