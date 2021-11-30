package com.scrumcloud.scrumcloud.service;

import com.scrumcloud.scrumcloud.dto.AlertaDTO;
import com.scrumcloud.scrumcloud.model.Alerta;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import com.scrumcloud.scrumcloud.model.Usuario;
import com.scrumcloud.scrumcloud.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaService {

    @Autowired
    SalaPlanningService salaPlanningService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    AlertaRepository repository;

    public void inserirAlerta(Alerta alerta) { repository.save(alerta); }

    public AlertaDTO buscarAlertasPorIdSalaAndIdUser(Long idSala, Long idUser) {
        return repository.buscarAlertasPorIdSalaAndIdUser(idSala, idUser);
    }

    public void deleteAlertaPorIdSala(Long idSala){
        repository.deleteAlertaPorIdSala(idSala);
    }
}
