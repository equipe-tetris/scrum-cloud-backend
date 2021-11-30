package com.scrumcloud.scrumcloud.resource;

import com.scrumcloud.scrumcloud.dto.AlertaDTO;
import com.scrumcloud.scrumcloud.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/alerta")
public class AlertaResource {

    @Autowired
    AlertaService service;

  @GetMapping("/buscarAlertasPorIdSalaAndIdUser")
  public ResponseEntity<AlertaDTO> buscarAlertasPorIdSalaAndIdUser(@RequestParam Long idSala, @RequestParam Long idUser) {
      AlertaDTO dto = service.buscarAlertasPorIdSalaAndIdUser(idSala, idUser);
      return ResponseEntity.ok().body(dto);
  }

}
