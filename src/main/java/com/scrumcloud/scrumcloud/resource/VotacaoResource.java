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
        Votacao votacao = service.inserirVoto(votacaoDTO);

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

    @GetMapping("/buscarVotosPorIdTask/{idTask}")
    public ResponseEntity<ResultadoVotosDTO> buscarVotosPorIdTask(@PathVariable Long idTask) {
        ResultadoVotosDTO result = service.buscarVotosPorIdTask(idTask);
        return ResponseEntity.ok(result);
    }

}
