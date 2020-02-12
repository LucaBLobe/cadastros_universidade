package com.cadastro.universidade.disciplina;

import com.cadastro.universidade.professor.ProfessorService;
import com.cadastro.universidade.turma.ITurmaRepository;
import com.cadastro.universidade.turma.Turma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DisciplinaService.class);
    private final IDisciplinaRepository iDisciplinaRepository;
    private final ProfessorService professorService;


    @Autowired
    public DisciplinaService(IDisciplinaRepository iDisciplinaRepository, ITurmaRepository iTurmaRepository, ProfessorService professorService) {
        this.iDisciplinaRepository = iDisciplinaRepository;

        this.professorService = professorService;
    }

    public DisciplinaDTO save(DisciplinaDTO disciplinaDTO) {

        LOGGER.info("Salvando Turma{}", disciplinaDTO);

        Disciplina disciplina = new Disciplina();
        disciplina.setNome(disciplinaDTO.getNome());
        disciplina.setProfessorId(professorService.findProfessorById(disciplinaDTO.getProfessorId()));

        disciplina = this.iDisciplinaRepository.save(disciplina);
        return disciplinaDTO.of(disciplina);
    }

    public Disciplina findDisciplinaById(Long id) {
        Optional<Disciplina> disciplinaOptional = this.iDisciplinaRepository.findById(id);
        if (disciplinaOptional.isPresent()) {
            return disciplinaOptional.get();
        }
        throw new IllegalArgumentException(String.format("ID %s não existe", id));
    }



}
