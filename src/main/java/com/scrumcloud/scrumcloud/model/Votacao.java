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
@Table(name = "task_votacao")
public class Votacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="task")
    private Task task;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="usuario")
    private Usuario usuario;

    @Column(name="valor_voto")
    private String valorVoto;
}
