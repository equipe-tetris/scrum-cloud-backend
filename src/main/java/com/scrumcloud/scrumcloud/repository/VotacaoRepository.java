package com.scrumcloud.scrumcloud.repository;

import com.scrumcloud.scrumcloud.dto.AtualizacaoVotoDTO;
import com.scrumcloud.scrumcloud.dto.VotacaoDTO;
import com.scrumcloud.scrumcloud.model.Votacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface VotacaoRepository extends JpaRepository<Votacao, Long> {

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.AtualizacaoVotoDTO(v.usuario.id, v.task.id) FROM Votacao v " +
            "WHERE v.task.id = :idTask ")
    List<AtualizacaoVotoDTO> atualizacaoVotoPorIdTask(Long idTask);

    @Query("SELECT v.valorVoto FROM Votacao v " +
            "WHERE v.task.id = :idTask ")
    List<String> buscarVotosPorIdTask(Long idTask);

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.VotacaoDTO(v.valorVoto) FROM Votacao v " +
            "WHERE v.task.id = :idTask AND v.usuario.id = :idUsuario" )
    VotacaoDTO buscarVotoPorIdTaskAndUsuario(Long idTask, Long idUsuario);

    @Transactional
    @Modifying
    @Query("UPDATE Votacao v set v.valorVoto = :valorVoto " +
            "WHERE v.task.id = :idTask AND v.usuario.id = :idUsuario")
    void updateValorVoto(String valorVoto, Long idTask, Long idUsuario);


}
