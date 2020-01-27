package com.cadastro.universidade.turma;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turma")
public class TurmaRest {


    private final TurmaService turmaService;

    @Autowired
    public TurmaRest(TurmaService turmaService) {
        this.turmaService = turmaService;
    }
    @PostMapping()
    public TurmaDTO save(@RequestBody TurmaDTO turmaDTO){
        return this.turmaService.save(turmaDTO);
    }
}
