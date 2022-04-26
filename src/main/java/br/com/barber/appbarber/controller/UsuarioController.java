package br.com.barber.appbarber.controller;

import br.com.barber.appbarber.models.Usuario;
import br.com.barber.appbarber.models.UsuarioDTO;
import br.com.barber.appbarber.models.form.UsuarioForm;
import br.com.barber.appbarber.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.websocket.server.PathParam;

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
    
    @RequestMapping(value = "/deletarusuario/{id}", method = RequestMethod.DELETE)
    public String deletarUsuario(@PathVariable int id){
    	usuarioRepository.deleteById(id);
    	return "Usuario Deletado";
    }
    
    @RequestMapping(value = "/buscarpornome/{nome}", method = RequestMethod.GET)
    public List<UsuarioDTO> buscarporNome(@PathVariable String nome){
    	List<Usuario> usuarios = usuarioRepository.buscarPorNome(nome);
    	List<UsuarioDTO> usuariosDTO = UsuarioDTO.converterDto(usuarios);
		return usuariosDTO;    	
    }
}
