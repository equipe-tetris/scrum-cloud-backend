package com.scrumcloud.scrumcloud.service;

import com.scrumcloud.scrumcloud.dto.SalaPlanningDTO;
import com.scrumcloud.scrumcloud.model.Equipe;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import com.scrumcloud.scrumcloud.model.Usuario;
import com.scrumcloud.scrumcloud.repository.SalaPlanningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SalaPlanningService {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private EquipeService equipeService;

    @Autowired
    private SalaPlanningRepository repository;


    public SalaPlanning cadastrar(SalaPlanningDTO objRel) {

        Usuario usuario = usuarioService.buscarPorId(objRel.getScrumMaster());
        Equipe equipe = equipeService.findById(objRel.getIdEquipe());

        SalaPlanning salaPlanning = new SalaPlanning();

        salaPlanning.setNome(objRel.getNome());
        salaPlanning.setScrumMaster(usuario);
        salaPlanning.setDataCriacao(LocalDate.now());
        salaPlanning.setMetricaSala(objRel.getMetricaSala());
        salaPlanning.setEquipe(equipe);

        return repository.save(salaPlanning);
    }
}
