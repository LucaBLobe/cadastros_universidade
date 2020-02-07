package com.cadastro.universidade.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:5000")
@RequestMapping("/professores")
public class ProfessorRest {

    private final ProfessorService professorService;
    private final IProfessorRepository iProfessorRepository;


    @Autowired
    public ProfessorRest(ProfessorService professorService, IProfessorRepository iProfessorRepository) {
        this.professorService = professorService;
        this.iProfessorRepository = iProfessorRepository;
    }


    @PostMapping("/save")
    public ProfessorDTO save(@RequestBody ProfessorDTO professorDTO){
        return this.professorService.save(professorDTO);
    }
    @GetMapping()
    public List<Professor> getProfessores() {
        return iProfessorRepository.findAll();
    }
}
