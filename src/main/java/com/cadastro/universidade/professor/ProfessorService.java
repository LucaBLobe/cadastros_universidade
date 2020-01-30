package com.cadastro.universidade.professor;

import com.cadastro.universidade.turma.Turma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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


        professor = this.iProfessorRepository.save(professor);
        return professorDTO.of(professor);
    }
    public Professor findProfessorById(Long id) {
        Optional<Professor> professorOptional = this.iProfessorRepository.findById(id);
        if (professorOptional.isPresent()) {
            return professorOptional.get();
        }
        throw new IllegalArgumentException(String.format("ID %s não existe", id));
    }

}
