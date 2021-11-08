package com.scrumcloud.scrumcloud.dto;

import lombok.*;

import java.util.List;

@Data @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ResultadoVotosDTO {

    private Long idTask;

    private List<String> votosString;

    private List<Integer> votosNumber;

    private Integer mediaVotosNumericos;

    private int numVotos;

    private int moda;
}
