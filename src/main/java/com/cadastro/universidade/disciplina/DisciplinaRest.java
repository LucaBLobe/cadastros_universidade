package com.cadastro.universidade.disciplina;

import com.cadastro.universidade.turma.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/disciplinas")
@CrossOrigin(origins = "http://localhost:5000")
public class DisciplinaRest {

    private final DisciplinaService disciplinaService;
    private final IDisciplinaRepository iDisciplinaRepository;
    private final TurmaService turmaService;

    @Autowired
    public DisciplinaRest(DisciplinaService disciplinaService, IDisciplinaRepository iDisciplinaRepository, TurmaService turmaService) {
        this.disciplinaService = disciplinaService;
        this.iDisciplinaRepository = iDisciplinaRepository;
        this.turmaService = turmaService;
    }

    @PostMapping("/save")
    public DisciplinaDTO save(@RequestBody DisciplinaDTO disciplinaDTO) {
        return this.disciplinaService.save(disciplinaDTO);
    }

    @GetMapping()
    public List<Disciplina> getDisciplinas() {
        return iDisciplinaRepository.findAll();
    }

    @GetMapping("/turma/{id}")
    public List<Disciplina> getDisciplinasTurma(@PathVariable("id") Long id) {
        return turmaService.findByTurmaId(id);
    }
}

