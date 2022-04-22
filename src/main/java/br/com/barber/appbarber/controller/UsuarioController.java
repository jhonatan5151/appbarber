package br.com.barber.appbarber.controller;

import br.com.barber.appbarber.models.Usuario;
import br.com.barber.appbarber.models.UsuarioDTO;
import br.com.barber.appbarber.models.form.UsuarioForm;
import br.com.barber.appbarber.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/cadastrarusuario", method = RequestMethod.POST)
    public String cadastrarUsuario(@RequestBody  UsuarioForm form){
        Usuario usuario = form.cadastrarUsuario();
        usuarioRepository.save(usuario);
        return "Usuario Cadastrado";
    }
}