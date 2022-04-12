package br.com.barber.appbarber.models;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDTO {
    private int id;
    private String nome;
    private String email;

    public UsuarioDTO(Usuario usuario){
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();

    }

    public static List<UsuarioDTO> converterDto(List<Usuario> usuarios){
        return usuarios.stream().map(UsuarioDTO::new).collect(Collectors.toList());
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}


