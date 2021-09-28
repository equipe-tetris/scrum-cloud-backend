package com.scrumcloud.scrumcloud.service;

import com.scrumcloud.scrumcloud.model.Usuario;
import com.scrumcloud.scrumcloud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario inserir(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> findAll(){
        return repository.findAll();
    }
}
