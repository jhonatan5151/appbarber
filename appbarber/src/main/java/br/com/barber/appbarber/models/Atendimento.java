package br.com.barber.appbarber.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Calendar;

@Entity
public class Atendimento {
    @Id
    private int id;
    @Column(name = "horario",nullable = false)
    private Calendar horario;
    @OneToOne
    private Usuario cliente;
    public Atendimento(Calendar horario) {
        this.horario = horario;
    }

    public Atendimento() {

    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Calendar getHorario() {
        return horario;
    }

    public void setHorario(Calendar horario) {
        this.horario = horario;
    }
}
