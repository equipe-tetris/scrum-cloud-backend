package com.scrumcloud.scrumcloud.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AtualizacaoVotoDTO {

    private Long idUser;

    private Long idTask;

    private Boolean votado;

    public AtualizacaoVotoDTO(Long idUser, Long idTask) {
        this.idUser = idUser;
        this.idTask = idTask;
    }
}
