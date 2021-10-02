package com.scrumcloud.scrumcloud.dto;

import com.scrumcloud.scrumcloud.model.Usuario;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private String tipoUsuario;
    private String senha;


    public UsuarioDTO(Long id, String email){
        this.id = id;
        this.email = email;
    }

    public UsuarioDTO(Long id, String nome, String email, String tipoUsuario){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
    }
}
