package br.com.barber.appbarber.models;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NotNull
    private int id;
    @Column(name = "nome_do_usuario", nullable = false)
    @NotNull @NotEmpty @Length(min = 10)
    private String nome;
    @Column(name = "email_do_usuario", nullable = false)
    @NotNull @NotEmpty @Length(min = 10)
    private String email;
    @Column(name = "senha_do_usuario", nullable = false)
    @NotNull @NotEmpty
    private String senha;

    public Usuario(String nome, int id, String email, String senha) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {

    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }
}