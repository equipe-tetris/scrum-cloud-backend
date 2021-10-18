package com.scrumcloud.scrumcloud.repository;

import com.scrumcloud.scrumcloud.dto.SalaPlanningDTO;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaPlanningRepository extends JpaRepository<SalaPlanning, Long> {

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.SalaPlanningDTO(sp.id, sp.nome, sp.scrumMaster.id, sp.dataCriacao, sp.metricaSala, sp.equipe.id, sp.equipe.nome) " +
            "FROM SalaPlanning sp " +
            "WHERE sp.scrumMaster.id = :idUser")
    public List<SalaPlanningDTO> buscarSalasPorIdUsuario(Long idUser);

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.SalaPlanningDTO(sp.id, sp.nome, sp.scrumMaster.id, sp.dataCriacao, sp.metricaSala, sp.equipe.id, sp.equipe.nome) " +
            "FROM SalaPlanning sp " +
            "WHERE sp.id = :id")
    public SalaPlanningDTO buscarSalaPorId(Long id);
}
