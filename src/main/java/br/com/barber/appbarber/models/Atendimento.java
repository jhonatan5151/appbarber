package br.com.barber.appbarber.models;


import br.com.barber.appbarber.repository.AtendimentoRepository;
import br.com.barber.appbarber.repository.UsuarioRepository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "horario",nullable = false)
    private LocalDateTime horario;
    @OneToOne
    private Usuario cliente;

    public Atendimento(int ano, int mes, int dia, int horas, int minutos) {
        horario = LocalDateTime.of(ano, mes, dia, horas, minutos);
    }

    public Atendimento() {

    }

    public Atendimento(Atendimento horarioAgendado) {
        this.id = horarioAgendado.getId();
        this.horario = horarioAgendado.getHorario();
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public void setCliente(Usuario usuario){
        this.cliente = usuario;
    }

    public static Atendimento agendar(int id, UsuarioRepository usuarioRepository, int id1, AtendimentoRepository atendimentoRepository) {
        Usuario usuario = usuarioRepository.getById(id);
        Atendimento horario = atendimentoRepository.getById(id1);
        horario.setCliente(usuario);
        return horario;

    }

    public Usuario getCliente() {
        return cliente;
    }
}
