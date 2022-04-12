package br.com.barber.appbarber.models;


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
}
