package com.scrumcloud.scrumcloud.repository;

import com.scrumcloud.scrumcloud.dto.TaskDTO;
import com.scrumcloud.scrumcloud.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.TaskDTO(task.id, task.conteudo, task.salaPlanning.id, task.dataCriacao, task.status)" +
            "FROM Task task WHERE task.salaPlanning.id = :idSala ")
    List<TaskDTO> buscarTasksPorIdSala(Long idSala);

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.TaskDTO(task.id, task.conteudo, task.salaPlanning.id, task.dataCriacao, task.status)" +
            "FROM Task task WHERE task.status like 'ATUAL' AND task.salaPlanning.id = :idSala ")
    TaskDTO buscarTaskAtualParaVotacaoPorIdSala(Long idSala);

    @Transactional
    @Modifying
    @Query("UPDATE Task task set task.status = :statusTask WHERE task.id = :idTask")
    void mudarStatusTask(String statusTask, Long idTask);

    @Transactional
    @Modifying
    @Query("UPDATE Task task set task.status = 'ABERTA' WHERE task.status like 'ATUAL' ")
    void changeAllStatusTask();

    @Query("SELECT task.status FROM Task task WHERE task.id = :idTask")
    String getStatusTaskPorId(Long idTask);

    @Transactional
    @Modifying
    @Query("UPDATE Task task set task.valorFinal = :valorFinal WHERE task.id = :idTask")
    void setValorFinalPorIdTask(String valorFinal, Long idTask);

    @Query("SELECT task.valorFinal FROM Task task WHERE task.id = :idTask")
    String getValorFinalTaskPorId(Long idTask);
}
