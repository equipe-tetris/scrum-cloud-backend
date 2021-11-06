package com.scrumcloud.scrumcloud.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VotacaoDTO {

    private Long idTask;

    private Long idUsuario;

    private String valorVoto;

    public VotacaoDTO(String valorVoto){
        this.valorVoto = valorVoto;
    }
}
