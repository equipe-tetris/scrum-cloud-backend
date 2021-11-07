package com.scrumcloud.scrumcloud.service;

import com.scrumcloud.scrumcloud.dto.SalaPlanningDTO;
import com.scrumcloud.scrumcloud.dto.UsuarioDTO;
import com.scrumcloud.scrumcloud.model.Equipe;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import com.scrumcloud.scrumcloud.model.Usuario;
import com.scrumcloud.scrumcloud.repository.SalaPlanningRepository;
import com.scrumcloud.scrumcloud.utils.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    public List<SalaPlanningDTO> buscarSalasPorIdUsuario(Long idUser) {
        return repository.buscarSalasPorIdUsuario(idUser);
    }

    public SalaPlanningDTO buscarSalaPorId(Long id) {
        return repository.buscarSalaPorId(id);
    }

    public SalaPlanning findById(Long id) {
        Optional<SalaPlanning> salaPlanning = repository.findById(id);
        return salaPlanning.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado!"));
    }

    public List<UsuarioDTO> buscarIntegrantesEquipePorIdSala(Long idSala) {
        return repository.buscarIntegrantesEquipePorIdSala(idSala);
    }


}
