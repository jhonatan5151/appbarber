package br.com.barber.appbarber.models.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.barber.appbarber.models.Usuario;

public class UsuarioForm {
	@NotNull @NotEmpty
    private String nome;
	@NotNull @NotEmpty
    private String email;
	@NotNull @NotEmpty 
    private String senha;

    UsuarioForm(String nome, String email,String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario cadastrarUsuario(){
        Usuario usuario = new Usuario(nome, email, senha);
        return  usuario;
    }

}
