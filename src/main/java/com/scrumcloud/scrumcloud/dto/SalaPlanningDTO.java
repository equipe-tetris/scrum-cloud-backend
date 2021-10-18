package com.scrumcloud.scrumcloud.dto;

import lombok.*;

import java.time.LocalDate;

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

    public SalaPlanningDTO(SalaPlanningDTO salaPlanning){
        this.nome = salaPlanning.getNome();
        this.scrumMaster = salaPlanning.getScrumMaster();
        this.metricaSala = salaPlanning.getMetricaSala();
        this.idEquipe = salaPlanning.getIdEquipe();
    }

    public SalaPlanningDTO(String nome, Long scrumMaster, String metricaSala, Long idEquipe) {
        this.nome = nome;
        this.scrumMaster = scrumMaster;
        this.metricaSala = metricaSala;
        this.idEquipe = idEquipe;
    }
}
