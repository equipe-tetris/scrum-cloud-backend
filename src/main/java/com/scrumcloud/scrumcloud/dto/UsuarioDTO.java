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

}
