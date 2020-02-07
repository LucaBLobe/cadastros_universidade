package com.cadastro.universidade.turma;


import com.cadastro.universidade.aluno.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5000")
@RequestMapping("/turma")
public class TurmaRest {


    private final TurmaService turmaService;
    private final ITurmaRepository iTurmaRepository;

    @Autowired
    public TurmaRest(TurmaService turmaService, ITurmaRepository iTurmaRepository) {
        this.turmaService = turmaService;
        this.iTurmaRepository = iTurmaRepository;
    }

    @PostMapping()
    public TurmaDTO save(@RequestBody TurmaDTO turmaDTO) {
        return this.turmaService.save(turmaDTO);
    }

    @GetMapping()
    public List<Turma> getItens() {
        return iTurmaRepository.findAll();
    }
}

