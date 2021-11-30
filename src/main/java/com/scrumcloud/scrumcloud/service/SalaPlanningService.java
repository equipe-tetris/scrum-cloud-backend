package com.scrumcloud.scrumcloud.service;

import com.scrumcloud.scrumcloud.dto.AlertaDTO;
import com.scrumcloud.scrumcloud.dto.ItemComboDTO;
import com.scrumcloud.scrumcloud.dto.SalaPlanningDTO;
import com.scrumcloud.scrumcloud.dto.UsuarioDTO;
import com.scrumcloud.scrumcloud.model.Alerta;
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

    @Autowired
    AlertaService alertaService;

    public SalaPlanning cadastrar(SalaPlanningDTO objRel) {

        Usuario usuario = usuarioService.buscarPorId(objRel.getScrumMaster());
        Equipe equipe = equipeService.findById(objRel.getIdEquipe());

        SalaPlanning salaPlanning = new SalaPlanning();

        salaPlanning.setNome(objRel.getNome());
        salaPlanning.setUsuario(usuario);
        salaPlanning.setDataCriacao(LocalDate.now());
        salaPlanning.setMetricaSala(objRel.getMetricaSala());
        salaPlanning.setEquipe(equipe);

        return repository.save(salaPlanning);
    }

    public List<SalaPlanningDTO> buscarSalasPorIdUsuario(Long idUser) {
        return repository.buscarSalasPorIdUsuario(idUser);
    }

    public List<SalaPlanningDTO> buscarSalasPorIdIntegrante(Long idUser) {
        return repository.buscarSalasPorIdIntegrante(idUser);
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

    public List<ItemComboDTO> buscarComboIntegrantesSala(Long idSala) {
        return repository.buscarComboIntegrantesSala(idSala);
    }

    public void changeSM (Long idUsuario, Long idSala) {

        SalaPlanning salaPlanning = findById(idSala);

        if(idUsuario != 0) {
            alertaService.deleteAlertaPorIdSala(salaPlanning.getId());

            Usuario usuario = usuarioService.buscarPorId(idUsuario);

            salaPlanning.setSmProvisorio(usuario);
            repository.save(salaPlanning);

            Alerta alerta = new Alerta();

            alerta.setMensagem("Você possui permissão de Scrum Master nesta sala.");
            alerta.setSalaPlanning(salaPlanning);
            alerta.setUsuario(usuario);

            alertaService.inserirAlerta(alerta);
            usuarioService.changeUserToSM(usuario.getId());
        } else {
            salaPlanning.setSmProvisorio(null);
            repository.save(salaPlanning);
            alertaService.deleteAlertaPorIdSala(salaPlanning.getId());

            }
        }
}



