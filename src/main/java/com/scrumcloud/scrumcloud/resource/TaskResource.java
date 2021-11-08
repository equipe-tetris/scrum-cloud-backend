package com.scrumcloud.scrumcloud.resource;

import com.scrumcloud.scrumcloud.dto.TaskDTO;
import com.scrumcloud.scrumcloud.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/task")
public class TaskResource {

    @Autowired
    TaskService service;

    @PostMapping("/inserir/{idSala}")
    public ResponseEntity inserirTasks(@RequestBody TaskDTO taskDTO, @PathVariable Long idSala) {
        List<String> list = service.inserirTasks(taskDTO.getListTask(), idSala);

        return ResponseEntity.ok(201);
    }

    @GetMapping("/buscarTasksPorIdSala/{idSala}")
    public ResponseEntity<List<TaskDTO>> buscarTasksPorIdSala(@PathVariable Long idSala) {
        List<TaskDTO> listTask = service.buscarTasksPorIdSala(idSala);

        return ResponseEntity.ok(listTask);
    }

    @PostMapping("/mudarStatusTaskPorId")
    public void mudarStatusTaksPorId(@RequestParam Boolean statusTask, @RequestParam Long idTask) {
        service.mudarStatusTaskPorId(statusTask, idTask);
    }
}
