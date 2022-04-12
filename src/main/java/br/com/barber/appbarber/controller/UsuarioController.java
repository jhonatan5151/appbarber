package br.com.barber.appbarber.controller;

import br.com.barber.appbarber.models.Usuario;
import br.com.barber.appbarber.models.UsuarioDTO;
import br.com.barber.appbarber.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("/")
    public final String teste() {
        return "OLA MUNdo";
    }

    @RequestMapping(value = "/sobre")
    public List<UsuarioDTO> sobre() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        Usuario usuario = new Usuario("jessy",12,"123@email.com","123456");
        usuarioRepository.save(usuario);

        return UsuarioDTO.converterDto(usuarios);
    }
}