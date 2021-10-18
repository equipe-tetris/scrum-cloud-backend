package com.scrumcloud.scrumcloud.resource;

import com.scrumcloud.scrumcloud.dto.SalaPlanningDTO;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import com.scrumcloud.scrumcloud.service.SalaPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/planning")
public class SalaPlanningResource {

    @Autowired
    SalaPlanningService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<SalaPlanning> cadastroPlanning(@RequestBody SalaPlanningDTO salaPlanning) {
       SalaPlanning sala = service.cadastrar(salaPlanning);

        return ResponseEntity.ok(sala);
    }
}
