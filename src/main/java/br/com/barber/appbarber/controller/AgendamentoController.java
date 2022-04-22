package br.com.barber.appbarber.controller;

import br.com.barber.appbarber.models.Atendimento;
import br.com.barber.appbarber.models.form.AgendamentoForm;
import br.com.barber.appbarber.repository.AtendimentoRepository;
import br.com.barber.appbarber.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;


@RestController
public class Agendamento {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private AtendimentoRepository atendimentoRepository;

    @RequestMapping(value = "agendar", method = RequestMethod.PATCH)
    @Transactional
    public String agendar(@RequestBody AgendamentoForm form){
        Atendimento horarioAgendado = Atendimento.agendar(form.getIdUsuario(), usuarioRepository, form.getIdHorario(), atendimentoRepository);
        return "Agendado";
    }
}
