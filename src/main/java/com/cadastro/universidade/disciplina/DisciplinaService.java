package com.cadastro.universidade.disciplina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DisciplinaService.class);
    private final IDisciplinaRepository iDisciplinaRepository;


    @Autowired
    public DisciplinaService(IDisciplinaRepository iDisciplinaRepository) {
        this.iDisciplinaRepository = iDisciplinaRepository;
    }

    public DisciplinaDTO save(DisciplinaDTO disciplinaDTO) {

        LOGGER.info("Salvando Turma{}", disciplinaDTO);

        Disciplina disciplina = new Disciplina();
        disciplina.setNome(disciplinaDTO.getNome());
        disciplina.setAlunoId(disciplinaDTO.getAlunoId());
        disciplina.setTurmaId(disciplinaDTO.getTurmaId());

        disciplina = this.iDisciplinaRepository.save(disciplina);
        return disciplinaDTO.of(disciplina);
    }
}
