package br.com.barber.appbarber.repository;

import br.com.barber.appbarber.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{}
