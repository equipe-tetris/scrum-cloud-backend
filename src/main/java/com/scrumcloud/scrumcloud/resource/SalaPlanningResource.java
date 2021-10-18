package com.scrumcloud.scrumcloud.resource;

import com.scrumcloud.scrumcloud.dto.EquipeDTO;
import com.scrumcloud.scrumcloud.dto.SalaPlanningDTO;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import com.scrumcloud.scrumcloud.service.SalaPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/planning")
public class SalaPlanningResource {

    @Autowired
    SalaPlanningService service;

    @PostMapping("/cadastrar")
    public ResponseEntity cadastroPlanning(@RequestBody SalaPlanningDTO salaPlanning) {
       SalaPlanning sala = service.cadastrar(salaPlanning);

        return ResponseEntity.ok(201);
    }

    @GetMapping("/buscarSalasPorIdUsuario/{idUser}")
    public ResponseEntity<List<SalaPlanningDTO>> buscarSalasPorIdUsuario(@PathVariable Long idUser) {
        List<SalaPlanningDTO> list = service.buscarSalasPorIdUsuario(idUser);

        return ResponseEntity.ok(list);
    }

    @GetMapping("/buscarSalaPorId/{id}")
    public ResponseEntity<SalaPlanningDTO> buscarSalaPorId(@PathVariable Long id) {
        SalaPlanningDTO sala = service.buscarSalaPorId(id);

        return ResponseEntity.ok(sala);
    }
}
