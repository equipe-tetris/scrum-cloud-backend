package com.scrumcloud.scrumcloud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "equipe")
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="data_criacao")
    private LocalDate dataCriacao;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="usuario")
    private Usuario usuario;

    @ManyToMany(cascade = { CascadeType.MERGE })
    @JoinTable(
            name = "integrantes_equipe",
            joinColumns = { @JoinColumn(name = "id_equipe") },
            inverseJoinColumns = { @JoinColumn(name = "id_usuario") } )
    private List<Usuario> listaUsuarios;


}
