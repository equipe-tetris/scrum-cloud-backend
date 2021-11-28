package com.scrumcloud.scrumcloud.repository;

import com.scrumcloud.scrumcloud.dto.AlertaDTO;
import com.scrumcloud.scrumcloud.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertaRepository extends JpaRepository<Alerta, Long> {

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.AlertaDTO(a.id, a.mensagem) FROM Alerta a " +
            "WHERE a.salaPlanning.id = :idSala AND a.usuario.id = :idUser")
    public List<AlertaDTO> buscarAlertasPorIdSalaAndIdUser(Long idSala, Long idUser);
}
