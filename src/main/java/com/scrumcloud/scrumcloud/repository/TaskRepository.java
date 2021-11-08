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

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.TaskDTO(task.id, task.conteudo, task.salaPlanning.id, task.dataCriacao, task.finalizado)" +
            "FROM Task task WHERE task.salaPlanning.id = :idSala ")
    List<TaskDTO> buscarTasksPorIdSala(Long idSala);

    @Transactional
    @Modifying
    @Query("UPDATE Task task set task.finalizado = :statusTask WHERE task.id = :idTask")
    void mudarStatusTask(Boolean statusTask, Long idTask);
}
