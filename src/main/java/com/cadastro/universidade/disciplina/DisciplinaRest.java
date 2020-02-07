package com.cadastro.universidade.disciplina;

import com.cadastro.universidade.aluno.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/disciplinas")
@CrossOrigin(origins = "http://localhost:5000")
public class DisciplinaRest {

    private final DisciplinaService disciplinaService;
    private final IDisciplinaRepository iDisciplinaRepository;

    @Autowired
    public DisciplinaRest(DisciplinaService disciplinaService, IDisciplinaRepository iDisciplinaRepository) {
        this.disciplinaService = disciplinaService;
        this.iDisciplinaRepository = iDisciplinaRepository;
    }

    @PostMapping("/save")
    public DisciplinaDTO save(@RequestBody DisciplinaDTO disciplinaDTO) {
        return this.disciplinaService.save(disciplinaDTO);
    }

    @GetMapping()
    public List<Disciplina> getDisciplinas() {
        return iDisciplinaRepository.findAll();
    }
}
