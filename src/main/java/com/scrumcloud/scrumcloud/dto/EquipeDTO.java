package com.scrumcloud.scrumcloud.dto;

import com.scrumcloud.scrumcloud.model.Equipe;
import com.scrumcloud.scrumcloud.model.Usuario;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EquipeDTO {
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataCriacao;
    private Long usuario;
    private String nomeUser;


    public EquipeDTO(EquipeDTO equipe){
        this.nome = equipe.getNome();
        this.descricao = equipe.getDescricao();
        this.usuario = equipe.getUsuario();
    }

    public EquipeDTO(Equipe equipe){
        this.id = equipe.getId();
        this.nome = equipe.getNome();
        this.descricao = equipe.getDescricao();
        this.dataCriacao = equipe.getDataCriacao();
        this.usuario = equipe.getUsuario().getId();
    }

}
