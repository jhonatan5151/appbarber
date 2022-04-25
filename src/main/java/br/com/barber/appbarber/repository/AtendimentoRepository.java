package br.com.barber.appbarber.repository;

import br.com.barber.appbarber.models.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {

}
