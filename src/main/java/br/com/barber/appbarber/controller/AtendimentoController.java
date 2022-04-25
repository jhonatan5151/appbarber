package br.com.barber.appbarber.controller;

import br.com.barber.appbarber.models.Atendimento;
import br.com.barber.appbarber.models.form.AtendimentoForm;
import br.com.barber.appbarber.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @RequestMapping(value = "listarhorarios", method = RequestMethod.GET)
    public List<Atendimento> listarHorarios(){
        List<Atendimento> horarios = atendimentoRepository.findAll();
        return horarios;
    }
    @RequestMapping(value = "listarhorarios/{id}", method = RequestMethod.GET)
    public Optional<Atendimento> listarFiltrado(@PathVariable int id){
        Optional<Atendimento> horario = atendimentoRepository.findById(id);
        return horario;
    }
    @RequestMapping(value = "deletarhorarios/{id}", method = RequestMethod.DELETE)
    public String deletarHorario(@PathVariable int id){
        atendimentoRepository.deleteById(id);
        return "Horario deletado";
    }


}
