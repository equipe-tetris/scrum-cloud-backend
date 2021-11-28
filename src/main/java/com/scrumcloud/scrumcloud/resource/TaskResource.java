package com.scrumcloud.scrumcloud.resource;

import com.scrumcloud.scrumcloud.dto.TaskDTO;
import com.scrumcloud.scrumcloud.model.Task;
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

    @GetMapping("/buscarTaskAtualParaVotacaoPorIdSala/{idSala}")
    public ResponseEntity<TaskDTO> buscarTaskAtualParaVotacaoPorIdSala(@PathVariable Long idSala) {
        TaskDTO taskAtual = service.buscarTaskAtualParaVotacaoPorIdSala(idSala);

        return ResponseEntity.ok().body(taskAtual);
    }

    @PostMapping("/mudarStatusTaskPorId")
    public ResponseEntity mudarStatusTaksPorId(@RequestParam String statusTask, @RequestParam Long idTask, @RequestParam Boolean permitir) {
        try {
            service.mudarStatusTaskPorId(statusTask, idTask, permitir);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ResponseEntity.ok(201);
    }

    @GetMapping("/getStatusTaskPorId/{idTask}")
    public ResponseEntity<String> getStatusTaskPorId(@PathVariable Long idTask) {
        String status = null;

        try {
            status = service.getStatusTaskPorId(idTask);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ResponseEntity.ok().body(status);
    }

    @PostMapping("/setValorFinalPorIdTask")
    public ResponseEntity setValorFinalPorIdTask(@RequestParam Long idTask, @RequestParam String valorTask) {
        try {
            service.setValorFinalPorIdTask(idTask, valorTask);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ResponseEntity.ok(201);
    }
    
    @GetMapping("/buscarValorFinalPorIdTask/{idTask}")
    public ResponseEntity<String> buscarValorFinalPorIdTask(@PathVariable Long idTask) {
        String valorFinal = null;

        try {
            valorFinal = service.getValorFinalTaskPorId(idTask);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return ResponseEntity.ok().body(valorFinal);
    }

    @DeleteMapping("/deletarPorId/{idTask}")
    public ResponseEntity deletarPorId(@PathVariable Long idTask) {
        try {
            service.deletarPorId(idTask);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return ResponseEntity.ok(200);
    }


}
