package br.com.barber.appbarber.models.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.barber.appbarber.models.Atendimento;

public class AtendimentoForm {
	@NotNull @NotEmpty
    private int ano, mes, dia, horas, minutos;

    public AtendimentoForm(int ano, int mes, int dia, int horas, int minutos) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.horas = horas;
        this.minutos = minutos;
    }

    public Atendimento criarHorario(){
        Atendimento horario = new Atendimento(ano,mes,dia,horas,minutos);
        return horario;

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
