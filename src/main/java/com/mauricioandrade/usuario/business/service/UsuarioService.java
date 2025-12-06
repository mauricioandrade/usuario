package com.mauricioandrade.usuario.business.service;

import com.mauricioandrade.usuario.business.converter.UsuarioConverter;
import com.mauricioandrade.usuario.business.dto.UsuarioDTO;
import com.mauricioandrade.usuario.infrastructure.entity.Usuario;
import com.mauricioandrade.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(
                usuarioRepository.save(usuario)
        );
    }
}
