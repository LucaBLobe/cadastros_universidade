package com.cadastro.universidade.turma;


import com.cadastro.universidade.disciplina.DisciplinaService;
import com.cadastro.universidade.disciplina.IDisciplinaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TurmaService.class);
    private final ITurmaRepository iTurmaRepository;
    private final DisciplinaService disciplinaService;

    @Autowired
    public TurmaService(ITurmaRepository iTurmaRepository, IDisciplinaRepository iDisciplinaRepository, DisciplinaService disciplinaService) {
        this.iTurmaRepository = iTurmaRepository;
        this.disciplinaService = disciplinaService;
    }

    public TurmaDTO save(TurmaDTO turmaDTO) {

        LOGGER.info("Salvando Turma{}", turmaDTO);

        Turma turma = new Turma();
        turma.setPeriodo(turmaDTO.getPeriodo());
        turma.setSerie(turmaDTO.getSerie());
        turma.setSigla(turmaDTO.getSigla());
        turma.setDisciplinaId(turmaDTO.getDisciplinaId());

        turma = this.iTurmaRepository.save(turma);
        return turmaDTO.of(turma);
    }

    public Turma findTurmaById(Long id) {
        Optional<Turma> turmaOptional = this.iTurmaRepository.findById(id);
        if (turmaOptional.isPresent()) {
            return turmaOptional.get();
        }
        throw new IllegalArgumentException(String.format("ID %s não existe", id));
    }
}

