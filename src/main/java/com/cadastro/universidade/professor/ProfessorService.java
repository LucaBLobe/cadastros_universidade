package com.cadastro.universidade.professor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProfessorService.class);
    private final IProfessorRepository iProfessorRepository;

    @Autowired
    public ProfessorService(IProfessorRepository iProfessorRepository) {
        this.iProfessorRepository = iProfessorRepository;
    }

    public ProfessorDTO save(ProfessorDTO professorDTO){
        LOGGER.info("Salvando Turma{}",professorDTO);
        Professor professor = new Professor();
        professor.setNome(professorDTO.getNome());
        professor.setTurmaId(professorDTO.getTurmaId());
        professor.setDisciplinas(professorDTO.getDisciplinas());

        professor = this.iProfessorRepository.save(professor);
        return professorDTO.of(professor);
    }
}
