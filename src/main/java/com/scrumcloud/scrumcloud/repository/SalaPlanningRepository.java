package com.scrumcloud.scrumcloud.repository;

import com.scrumcloud.scrumcloud.dto.ItemComboDTO;
import com.scrumcloud.scrumcloud.dto.SalaPlanningDTO;
import com.scrumcloud.scrumcloud.dto.UsuarioDTO;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import com.scrumcloud.scrumcloud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaPlanningRepository extends JpaRepository<SalaPlanning, Long> {

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.SalaPlanningDTO(sp.id, sp.nome, sp.usuario.id, sp.dataCriacao, sp.metricaSala, sp.equipe.id, sp.equipe.nome) " +
            "FROM SalaPlanning sp " +
            "WHERE sp.usuario.id = :idUser")
    List<SalaPlanningDTO> buscarSalasPorIdUsuario(Long idUser);

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.SalaPlanningDTO(sala.id, sala.nome, sala.usuario.id, sala.dataCriacao, sala.metricaSala, sala.equipe.id, sala.equipe.nome) " +
            "FROM SalaPlanning sala " +
            "INNER JOIN sala.equipe equipeSala " +
            "INNER JOIN equipeSala.integrantesEquipe user " +
            "WHERE user.id = :idUser")
    List<SalaPlanningDTO> buscarSalasPorIdIntegrante(Long idUser);

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.SalaPlanningDTO(sp.id, sp.nome, sp.usuario.id, sp.dataCriacao, sp.metricaSala, sp.equipe.id, sp.equipe.nome) " +
            "FROM SalaPlanning sp " +
            "WHERE sp.id = :id")
    SalaPlanningDTO buscarSalaPorId(Long id);

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.UsuarioDTO(user.id, user.nome, user.email, user.tipoUsuario) " +
            "FROM SalaPlanning sala " +
            "INNER JOIN sala.equipe equipeSala " +
            "INNER JOIN equipeSala.integrantesEquipe user " +
            "WHERE sala.id = :idSala")
    List<UsuarioDTO> buscarIntegrantesEquipePorIdSala(Long idSala);

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.ItemComboDTO(user.id, user.nome) " +
            "FROM SalaPlanning sala " +
            "INNER JOIN sala.equipe equipeSala " +
            "INNER JOIN equipeSala.integrantesEquipe user " +
            "WHERE sala.id = :idSala")
    List<ItemComboDTO> buscarComboIntegrantesSala(Long idSala);
}
