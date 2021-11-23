package com.scrumcloud.scrumcloud.service;

import com.scrumcloud.scrumcloud.dto.AtualizacaoVotoDTO;
import com.scrumcloud.scrumcloud.dto.ResultadoVotosDTO;
import com.scrumcloud.scrumcloud.dto.VotacaoDTO;
import com.scrumcloud.scrumcloud.model.Task;
import com.scrumcloud.scrumcloud.model.Usuario;
import com.scrumcloud.scrumcloud.model.Votacao;
import com.scrumcloud.scrumcloud.repository.VotacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@Service
public class VotacaoService {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    TaskService taskService;

    @Autowired
    VotacaoRepository repository;

    public void inserirVoto(VotacaoDTO objRef) {
        Task task = taskService.findById(objRef.getIdTask());
        Usuario user = usuarioService.buscarPorId(objRef.getIdUsuario());

        VotacaoDTO votacaoDTO = buscarVotoPorIdTaskAndUsuario(objRef.getIdTask(), objRef.getIdUsuario());

        if(votacaoDTO == null) {
            Votacao votacao = new Votacao();

            votacao.setTask(task);
            votacao.setUsuario(user);
            votacao.setValorVoto(objRef.getValorVoto());

            repository.save(votacao);
        } else {
            repository.updateValorVoto(objRef.getValorVoto(),objRef.getIdTask(), objRef.getIdUsuario());
        }
    }

    public List<AtualizacaoVotoDTO> atualizacaoVotoPorIdTask(Long idTask) {

        List<AtualizacaoVotoDTO> list = repository.atualizacaoVotoPorIdTask(idTask);

        list.forEach(voto -> {
            voto.setVotado(true);
        });

        return list;
    }

    public ResultadoVotosDTO buscarInfoVotosPorIdTask(Long idTask) {

        ResultadoVotosDTO result = new ResultadoVotosDTO();

        List<String> listToCompare = new ArrayList<String>(Arrays.asList("infinito", "?", "cafe", "xl", "x", "m", "p"));
        List<String> listAux = repository.buscarVotosPorIdTask(idTask);

        List<Integer> listNumAux = new ArrayList<>();
        List<String> listStrAux = new ArrayList<>();

        listAux.forEach(voto -> {
            if(!listToCompare.contains(voto)){
                Integer numAux = Integer.valueOf(voto);
               listNumAux.add(numAux);
            } else {
              listStrAux.add(voto);
            }
        });

        result.setNumVotos(listAux.size());
        result.setVotosNumber(listNumAux);
        result.setVotosString(listStrAux);
        result.setMediaVotosNumericos(calcularMediaVotosNumericos(listNumAux));
        result.setModa(calcularModa(listNumAux));
        result.setIdTask(idTask);

        return result;
    }

    public Integer buscarNumVotosPorIdTask(Long idTask) {

        List<String> listAux = repository.buscarVotosPorIdTask(idTask);
        Integer numVotos = listAux.size();

        return numVotos;
    }

    public VotacaoDTO buscarVotoPorIdTaskAndUsuario(Long idTask, Long idUsuario) {
        VotacaoDTO voto =  repository.buscarVotoPorIdTaskAndUsuario(idTask, idUsuario);
        return voto;
    }

    public Integer calcularMediaVotosNumericos(List<Integer> listNum) {
        Integer totalVotos = 0;
        for (Integer i : listNum) {
            totalVotos += i;
        }

        Integer media = totalVotos / listNum.size();

        return media;
    }

    public Integer calcularModa(List<Integer> listNum) {
        int[] a = listNum.stream().mapToInt(i->i).toArray();

        int maxValue = 0;
        int maxCount = 0;

        for (int i = 0; i < a.length; ++i) {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }

        return maxValue;

    }


}
