package com.scrumcloud.scrumcloud.service;

import com.scrumcloud.scrumcloud.dto.TaskDTO;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import com.scrumcloud.scrumcloud.model.Task;
import com.scrumcloud.scrumcloud.repository.TaskRepository;
import com.scrumcloud.scrumcloud.utils.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    SalaPlanningService salaPlanningService;

    @Autowired
    TaskRepository repository;

    public List<String> inserirTasks(List<String> listTasks, Long idSala) {

        SalaPlanning sala = salaPlanningService.findById(idSala);

        listTasks.forEach(item -> {
            Task task = new Task();

            task.setConteudo(item);
            task.setSalaPlanning(sala);
            task.setDataCriacao(LocalDate.now());

            repository.save(task);
        });
        return listTasks;
    }

    public List<TaskDTO> buscarTasksPorIdSala(Long idSala) {
        List<TaskDTO> list = repository.buscarTasksPorIdSala(idSala);

        return list;
    }

    public void mudarStatusTaskPorId(Boolean statusTask, Long idTask) {
        repository.mudarStatusTask(statusTask, idTask);
    }

    public Task findById(Long id) {
        Optional<Task> task = repository.findById(id);
        return task.orElseThrow(() -> new ObjectNotFoundException("Task não encontrada!"));
    }
}