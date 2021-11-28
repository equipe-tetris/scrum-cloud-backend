package com.scrumcloud.scrumcloud.service;

import com.scrumcloud.scrumcloud.dto.AlertaDTO;
import com.scrumcloud.scrumcloud.model.Alerta;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import com.scrumcloud.scrumcloud.model.Usuario;
import com.scrumcloud.scrumcloud.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertaService {

    @Autowired
    SalaPlanningService salaPlanningService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    AlertaRepository repository;

    public void inserirAlerta(AlertaDTO dto) {
        SalaPlanning sala = salaPlanningService.findById(dto.getIdSala());
        Usuario usuario = usuarioService.buscarPorId(dto.getIdUsuario());

        Alerta alerta = new Alerta();

        alerta.setMensagem(dto.getMensagem());
        alerta.setSalaPlanning(sala);
        alerta.setUsuario(usuario);

        repository.save(alerta);
    }
}
