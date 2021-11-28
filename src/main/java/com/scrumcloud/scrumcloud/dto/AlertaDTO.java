package com.scrumcloud.scrumcloud.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlertaDTO {

    private Long id;

    private String mensagem;

    private Long idSala;

    private Long idUsuario;

    public AlertaDTO(Long id, String mensagem) {
        this.id = id;
        this.mensagem = mensagem;
    }
}
