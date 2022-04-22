package br.com.barber.appbarber.models;

import java.time.LocalDateTime;

public class AtendimentoDTO {

    private int id;
    private LocalDateTime horario;
    private String nomeCliente;

    public AtendimentoDTO(int id, LocalDateTime horario, String nomeCliente) {
        this.id = id;
        this.horario = horario;
        this.nomeCliente = nomeCliente;
    }

    public AtendimentoDTO(Atendimento horarioAgendado) {
        this.id = horarioAgendado.getId();
        this.horario = horarioAgendado.getHorario();
        this.nomeCliente = horarioAgendado.getCliente().getNome();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
