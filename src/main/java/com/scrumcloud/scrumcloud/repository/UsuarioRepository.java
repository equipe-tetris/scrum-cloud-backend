package com.scrumcloud.scrumcloud.repository;

import com.scrumcloud.scrumcloud.dto.ItemComboDTO;
import com.scrumcloud.scrumcloud.dto.UsuarioDTO;
import com.scrumcloud.scrumcloud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.UsuarioDTO(user.id, user.email) " +
            "from Usuario user WHERE lower(user.email) like :email")
    UsuarioDTO findByEmail(String email);

    @Query("SELECT new com.scrumcloud.scrumcloud.dto.UsuarioDTO(user.id, user.nome, user.email, user.tipoUsuario) " +
            "from Usuario user WHERE lower(user.email) like :email and user.senha like :senha")
    UsuarioDTO authentication(String email, String senha);
}
