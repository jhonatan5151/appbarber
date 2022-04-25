package br.com.barber.appbarber.controller;

import br.com.barber.appbarber.models.Atendimento;
import br.com.barber.appbarber.models.form.AtendimentoForm;
import br.com.barber.appbarber.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AtendimentoController {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    @RequestMapping(value="/cadastrarhorario", method = RequestMethod.POST)
    public String cadastrarHorario(@RequestBody AtendimentoForm form){
        Atendimento horario = form.criarHorario();
        atendimentoRepository.save(horario);
        return "Cadastrado";
    }
}
