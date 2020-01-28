package com.cadastro.universidade.disciplina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaRest {

    private final DisciplinaService disciplinaService;

    @Autowired
    public DisciplinaRest(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @PostMapping()
    public DisciplinaDTO save(@RequestBody DisciplinaDTO disciplinaDTO) {
        return this.disciplinaService.save(disciplinaDTO);
    }
}
