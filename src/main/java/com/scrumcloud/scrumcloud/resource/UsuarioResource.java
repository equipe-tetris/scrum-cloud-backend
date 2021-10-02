package com.scrumcloud.scrumcloud.resource;

import com.scrumcloud.scrumcloud.dto.AuthDTO;
import com.scrumcloud.scrumcloud.dto.UsuarioDTO;
import com.scrumcloud.scrumcloud.model.Usuario;
import com.scrumcloud.scrumcloud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    @Autowired
    UsuarioService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastroUsuario(@RequestBody Usuario usuario) {

        Usuario user = service.inserir(usuario);
        return ResponseEntity.ok("Cadastro Realizado!");
    }

    @GetMapping("/buscarTodos")
    public List<Usuario> findAll() {
        List<Usuario> list = service.findAll();

        return list;
    }

    @PostMapping("/login")
    public ResponseEntity<UsuarioDTO> login(@RequestBody AuthDTO user){
        UsuarioDTO auth = service.authentication(user);

        return ResponseEntity.ok(auth);
    }
}
