package com.scrumcloud.scrumcloud.repository;

import com.scrumcloud.scrumcloud.dto.AtualizacaoVotoDTO;
import com.scrumcloud.scrumcloud.dto.VotacaoDTO;
import com.scrumcloud.scrumcloud.model.Votacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VotacaoRepository extends JpaRepository<Votacao, Long> {

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.AtualizacaoVotoDTO(v.usuario.id, v.task.id) FROM Votacao v " +
            "WHERE v.task.id = :idTask ")
    List<AtualizacaoVotoDTO> atualizacaoVotoPorIdTask(Long idTask);

    @Query("SELECT v.valorVoto FROM Votacao v " +
            "WHERE v.task.id = :idTask ")
    List<String> buscarVotosPorIdTask(Long idTask);
}
