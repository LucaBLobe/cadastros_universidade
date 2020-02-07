package com.cadastro.universidade.aluno;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5000")
@RequestMapping("/alunos")
public class AlunoRest {

    private final AlunoService alunoService;
    private final IAlunoRepository iAlunoRepository;

    @Autowired
    public AlunoRest(AlunoService alunoService, IAlunoRepository iAlunoRepository) {
        this.alunoService = alunoService;
        this.iAlunoRepository = iAlunoRepository;
    }

    @PostMapping("/save")
    public AlunoDTO save(@RequestBody AlunoDTO alunoDTO) {
        return this.alunoService.save(alunoDTO);
    }

    @GetMapping()
    public List<Aluno> getItens() {
        return iAlunoRepository.findAll();
    }
}

