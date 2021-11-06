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

    private Boolean finalizado;



    public TaskDTO(Long id, String conteudo, Long idSala, LocalDate dataCriacao, Boolean finalizado){
        this.id = id;
        this.conteudo = conteudo;
        this.idSala = idSala;
        this.dataCriacao = dataCriacao;
        this.finalizado = finalizado;
    }
}
