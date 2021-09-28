package com.scrumcloud.scrumcloud.resource;

import com.scrumcloud.scrumcloud.model.Usuario;
import com.scrumcloud.scrumcloud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    @Autowired
    UsuarioService service;

    @PostMapping("/cadastrar")
    public String cadastroUsuario(@RequestBody Usuario usuario) {

        Usuario user = service.inserir(usuario);
        return "Cadastro realizado " + user.getId();
    }

    @GetMapping("/buscarTodos")
    public List<Usuario> findAll() {
        List<Usuario> list = service.findAll();

        return list;
    }
}
