package br.com.barber.appbarber.repository;

import br.com.barber.appbarber.models.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	@Query("SELECT u FROM Usuario u WHERE u.nome = :nome")
	List<Usuario> buscarPorNome(String nome);}
