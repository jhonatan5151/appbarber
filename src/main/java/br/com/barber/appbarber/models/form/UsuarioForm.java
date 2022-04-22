package br.com.barber.appbarber.models.form;

import br.com.barber.appbarber.models.Usuario;

public class UsuarioForm {
    private String nome;
    private String email;
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
