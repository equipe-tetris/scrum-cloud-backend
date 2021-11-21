package com.scrumcloud.scrumcloud.resource;

import com.scrumcloud.scrumcloud.dto.AtualizacaoVotoDTO;
import com.scrumcloud.scrumcloud.dto.ResultadoVotosDTO;
import com.scrumcloud.scrumcloud.dto.VotacaoDTO;
import com.scrumcloud.scrumcloud.model.Votacao;
import com.scrumcloud.scrumcloud.service.VotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@CrossOrigin
@RestController
@RequestMapping("/votacao")
public class VotacaoResource {

    @Autowired
    VotacaoService service;

    @PostMapping("/inserirVoto")
    public ResponseEntity inserirVoto(@RequestBody VotacaoDTO votacaoDTO) {
        service.inserirVoto(votacaoDTO);

        return ResponseEntity.ok(201);
    }

    @GetMapping("/status-task/{idTask}")
    DeferredResult<List<AtualizacaoVotoDTO>> atualizacaoVotoPorIdTask(@PathVariable Long idTask){
        Long timeOutInMilliSec = 100000L;
        String timeOutResp = "Time Out.";
        DeferredResult<List<AtualizacaoVotoDTO>> deferredResult = new DeferredResult<>(timeOutInMilliSec,timeOutResp);
        CompletableFuture.runAsync(() -> {
            try {
                List<AtualizacaoVotoDTO> listVotos = service.atualizacaoVotoPorIdTask(idTask);

                deferredResult.setResult(listVotos);
            }catch (Exception ex){

            }
        });
        return deferredResult;
    }

    @GetMapping("/buscarInfoVotosPorIdTask/{idTask}")
    public ResponseEntity<ResultadoVotosDTO> buscarInfoVotosPorIdTask(@PathVariable Long idTask) {
        ResultadoVotosDTO result = service.buscarInfoVotosPorIdTask(idTask);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/buscarNumVotosPorIdTask/{idTask}")
    public ResponseEntity<Integer> buscarNumVotosPorIdTask(@PathVariable Long idTask) {
        Integer numVotos = null;
        try {
            numVotos = service.buscarNumVotosPorIdTask(idTask);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


        return ResponseEntity.ok().body(numVotos);
    }


}
