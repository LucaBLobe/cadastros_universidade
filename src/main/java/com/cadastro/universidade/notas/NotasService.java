package com.cadastro.universidade.notas;

import com.cadastro.universidade.aluno.AlunoService;
import com.cadastro.universidade.disciplina.DisciplinaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotasService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotasService.class);
    private final INotasRepository iNotasRepository;
    private final AlunoService alunoService;
    private final DisciplinaService disciplinaService;

    @Autowired
    public NotasService(INotasRepository iNotasRepository, AlunoService alunoService, DisciplinaService disciplinaService) {
        this.iNotasRepository = iNotasRepository;
        this.alunoService = alunoService;
        this.disciplinaService = disciplinaService;
    }

    public NotasDTO save(NotasDTO notasDTO){
        LOGGER.info("Salvando Turma{}",notasDTO);

        Notas notas= new Notas();
        notas.setNota(notasDTO.getNota());
        notas.setAlunoId(alunoService.findAlunoById(notasDTO.getAlunoId()));
        notas.setDisciplinaId(disciplinaService.findDisciplinaById(notasDTO.getDisciplinaId()));

        notas = this.iNotasRepository.save(notas);
        return notasDTO.of(notas);
    }


}
