package com.scrumcloud.scrumcloud.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SalaPlanningDTO {

    private Long id;
    private String nome;
    private Long scrumMaster;
    private LocalDate dataCriacao;
    private String metricaSala;
    private Long idEquipe;
    private String nomeEquipe;

    public SalaPlanningDTO(SalaPlanningDTO salaPlanning){
        this.nome = salaPlanning.getNome();
        this.scrumMaster = salaPlanning.getScrumMaster();
        this.metricaSala = salaPlanning.getMetricaSala();
        this.idEquipe = salaPlanning.getIdEquipe();
    }


}
