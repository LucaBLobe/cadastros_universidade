package com.cadastro.universidade.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professores")
public class ProfessorRest {

    private final ProfessorService professorService;

    @Autowired
    public ProfessorRest(ProfessorService professorService) {
        this.professorService = professorService;
    }
    @PostMapping
    public ProfessorDTO save(@RequestBody ProfessorDTO professorDTO){
        return this.professorService.save(professorDTO);
    }
}
