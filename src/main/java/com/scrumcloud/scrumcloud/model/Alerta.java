package com.scrumcloud.scrumcloud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "alerta")
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="mensagem_alerta", nullable = false)
    private String mensagem;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="sala_planning")
    private SalaPlanning salaPlanning;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="usuario")
    private Usuario usuario;
}
