package com.scrumcloud.scrumcloud.resource;

import com.google.common.io.ByteSource;
import com.scrumcloud.scrumcloud.dto.EquipeDTO;
import com.scrumcloud.scrumcloud.dto.ItemComboDTO;
import com.scrumcloud.scrumcloud.dto.SalaPlanningDTO;
import com.scrumcloud.scrumcloud.dto.UsuarioDTO;
import com.scrumcloud.scrumcloud.model.SalaPlanning;
import com.scrumcloud.scrumcloud.model.Usuario;
import com.scrumcloud.scrumcloud.service.RelatorioService;
import com.scrumcloud.scrumcloud.service.SalaPlanningService;
import com.scrumcloud.scrumcloud.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/planning")
public class SalaPlanningResource {

    @Autowired
    SalaPlanningService service;

    @Autowired
    TaskService taskService;

    @Autowired
    RelatorioService relatorioService;

    @PostMapping("/cadastrar")
    public ResponseEntity<SalaPlanning> cadastroPlanning(@RequestBody SalaPlanningDTO salaPlanning) {
       SalaPlanning sala = service.cadastrar(salaPlanning);

       return ResponseEntity.ok(sala);
    }

    @GetMapping("/buscarSalasPorIdUsuario/{idUser}")
    public ResponseEntity<List<SalaPlanningDTO>> buscarSalasPorIdUsuario(@PathVariable Long idUser) {
        List<SalaPlanningDTO> list = service.buscarSalasPorIdUsuario(idUser);

        return ResponseEntity.ok(list);
    }

    @GetMapping("/buscarSalasPorIdIntegrante/{idUser}")
    public ResponseEntity<List<SalaPlanningDTO>> buscarSalasPorIdIntegrante(@PathVariable Long idUser) {
        List<SalaPlanningDTO> list = service.buscarSalasPorIdIntegrante(idUser);

        return ResponseEntity.ok(list);
    }

    @GetMapping("/buscarSalaPorId/{id}")
    public ResponseEntity<SalaPlanningDTO> buscarSalaPorId(@PathVariable Long id) {
        SalaPlanningDTO sala = service.buscarSalaPorId(id);

        return ResponseEntity.ok(sala);
    }

    @GetMapping("/buscarIntegrantesEquipePorIdSala/{idSala}")
    public ResponseEntity<List<UsuarioDTO>>buscarIntegrantesEquipePorIdSala(@PathVariable Long idSala){
        List<UsuarioDTO> list = service.buscarIntegrantesEquipePorIdSala(idSala);

        return ResponseEntity.ok(list);
    }

    @GetMapping("/gerarRelatorioDaSala/{idSala}")
    public ResponseEntity<Resource> gerarRelatorioDaSala(@PathVariable Long idSala) throws IOException {

        File file = relatorioService.gerarArquivoXlsx(idSala);
        byte[] fileContent = Files.readAllBytes(file.toPath());
        file.delete();

        InputStream targetStream = ByteSource.wrap(fileContent).openStream();
        InputStreamResource resource = new InputStreamResource(targetStream);

        return 	ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .header(HttpHeaders.CONTENT_DISPOSITION , "attachment; filename=\"relatorio-sala-planning.xlsx\"")
                .body(resource);
    }

    @GetMapping("/buscarComboIntegrantesSala/{idSala}")
    public ResponseEntity<List<ItemComboDTO>> buscarComboIntegrantesSala(@PathVariable Long idSala){
        List<ItemComboDTO> list = service.buscarComboIntegrantesSala(idSala);
        return ResponseEntity.ok(list);
    }
}
