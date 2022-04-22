package br.com.barber.appbarber.models.form;

public class AgendamentoForm {

    private int idUsuario;
    private int idHorario;

    public AgendamentoForm(int idUsuario, int idHorario) {
        this.idUsuario = idUsuario;
        this.idHorario = idHorario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
}
