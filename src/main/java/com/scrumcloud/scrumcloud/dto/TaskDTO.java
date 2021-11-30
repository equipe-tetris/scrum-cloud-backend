package com.scrumcloud.scrumcloud.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {

    private Long id;

    private String conteudo;

    private Long idSala;

    private LocalDate dataCriacao;

    private List<String> listTask;

    private String status;



    public TaskDTO(Long id, String conteudo, Long idSala, LocalDate dataCriacao, String status){
        this.id = id;
        this.conteudo = conteudo;
        this.idSala = idSala;
        this.dataCriacao = dataCriacao;
        this.status = status;
    }
}
